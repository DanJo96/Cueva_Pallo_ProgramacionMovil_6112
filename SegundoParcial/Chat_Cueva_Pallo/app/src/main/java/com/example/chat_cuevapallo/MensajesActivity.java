package com.example.chat_cuevapallo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.example.chat_cuevapallo.adapters.AdapterChatLista;
import com.example.chat_cuevapallo.adapters.AdapterMensajeLista;
import com.example.chat_cuevapallo.pojos.Chats;
import com.example.chat_cuevapallo.pojos.Estado;
import com.example.chat_cuevapallo.pojos.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MensajesActivity extends AppCompatActivity {
    CircleImageView img_user;
    TextView username;
    ImageView ic_conectado,ic_desconectado;
    SharedPreferences mPref;
    RecyclerView recyclerViewMensajes;
    AdapterMensajeLista adapterMensajeLista;

    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref_estado = database.getReference("Estado").child(user.getUid());
    DatabaseReference ref_chat = database.getReference("Chats");

    EditText et_mensaje_txt;
    ImageButton btn_enviar_msj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mensajes);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mPref = getApplicationContext().getSharedPreferences("usuario_sp",MODE_PRIVATE);
        img_user=findViewById(R.id.img_usuario);
        username=findViewById(R.id.tv_user);
        ic_conectado=findViewById(R.id.icon_conectado);
        ic_desconectado=findViewById(R.id.icon_desconectado);
        String usuario = getIntent().getExtras().getString("nombre");
        String foto = getIntent().getExtras().getString("img_user");
        final String id_user = getIntent().getExtras().getString("id_user");
        final String id_unico = getIntent().getExtras().getString("id_unico");

        recyclerViewMensajes=findViewById(R.id.rvMensajes);
        recyclerViewMensajes.setLayoutManager(new LinearLayoutManager(this));

        final List<Chats> chats=new ArrayList<>();
        adapterMensajeLista = new AdapterMensajeLista(chats,this);
        recyclerViewMensajes.setAdapter(adapterMensajeLista);
        FirebaseDatabase database= FirebaseDatabase.getInstance();
        DatabaseReference myref= database.getReference("Chats").child(id_unico);
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    recyclerViewMensajes.setVisibility(View.VISIBLE);
                    System.out.println("AAAAAAAAAAAAquiiiii!!!!!!!!!!!!!!!!!!!!!");
                    chats.removeAll(chats);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        Chats chat= snapshot.getValue(Chats.class);
                        chats.add(chat);
                        System.out.println(chats.size());
                    }
                    adapterMensajeLista.notifyDataSetChanged();
                }else {

                    Toast.makeText(getApplicationContext() , "No existen mensajes", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        et_mensaje_txt=findViewById(R.id.txt_mensaje);
        btn_enviar_msj=findViewById(R.id.btn_enviar_mensaje);
        btn_enviar_msj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msj= et_mensaje_txt.getText().toString();
                Chats chatmsj = new Chats(user.getUid(),id_user,msj,"no");
                ref_chat.child(id_unico).push().setValue(chatmsj);
                Toast.makeText(MensajesActivity.this,"Mensaje enviado",Toast.LENGTH_SHORT).show();
                et_mensaje_txt.setText("");

            }
        });

        final String id_user_sp=mPref.getString("usuario_sp","");
        username.setText(usuario);
        Glide.with(this).load(foto).into(img_user);

        final DatabaseReference ref= database.getReference("Estado").child(id_user_sp).child("chatcon");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String chatcon = dataSnapshot.getValue(String.class);
                if (dataSnapshot.exists()){
                    if(chatcon.equals(user.getUid())){
                        ic_conectado.setVisibility(View.VISIBLE);
                        ic_desconectado.setVisibility(View.GONE);
                    }else{
                        ic_desconectado.setVisibility(View.VISIBLE);
                        ic_conectado.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }//fin del create
    private void estadoUsuario(final String estado) {
        ref_estado.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                final String id_user_sp=mPref.getString("usuario_sp","");
                Estado est= new Estado(estado,"","",id_user_sp);
                ref_estado.setValue(est);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        estadoUsuario("conectado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        estadoUsuario("desconectado");
        dameultimafecha();
    }

    private void dameultimafecha() {
        final Calendar c = Calendar.getInstance();
        final SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm");
        final SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        ref_estado.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ref_estado.child("fecha").setValue(dateFormat.format(c.getTime()));
                ref_estado.child("hora").setValue(timeFormat.format(c.getTime()));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public List<Chats> obtenerChats(){
        List<Chats> chats=new ArrayList<>();
        chats.add(new Chats());
        return chats;
    }
}