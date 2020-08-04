package com.example.chat_cuevapallo.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chat_cuevapallo.R;
import com.example.chat_cuevapallo.Modelo.Chats;
import com.example.chat_cuevapallo.Modelo.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;


/**
 * The type Adapter mensaje lista.
 */
public class AdapterMensajeLista extends RecyclerView.Adapter<AdapterMensajeLista.viewHolderAdaptermensajelist> {
    /**
     * The Chats list.
     */
    List<Chats> chatsList;
    /**
     * The Context.
     */
    Context context;
    /**
     * The User.
     */
    FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
    /**
     * The Database.
     */
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    /**
     * The M pref.
     */
    SharedPreferences mPref;


    /**
     * Instantiates a new Adapter mensaje lista.
     *
     * @param chats   the chats
     * @param context the context
     */
    public AdapterMensajeLista(List<Chats> chats, Context context) {

        this.chatsList = chats;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderAdaptermensajelist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mensajelist,parent,false);
        viewHolderAdaptermensajelist holder = new viewHolderAdaptermensajelist(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolderAdaptermensajelist holder, int position) {
        try {
            final Chats chat = chatsList.get(position);
            final Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            if (chat.getVisto().equals("no")) {
                holder.tv_usuario.setVisibility(View.VISIBLE);
                holder.mensajeFoto.setVisibility(View.GONE);
                holder.tv_usuario.setText(chat.getMensaje());
            } else if (chat.getVisto().equals("si")) {
                holder.tv_usuario.setVisibility(View.GONE);
                holder.mensajeFoto.setVisibility(View.VISIBLE);
                Glide.with(context).load(chat.getMensaje()).into(holder.mensajeFoto);
            }
            final Users[] userss = {new Users()};
            DatabaseReference ref_mis_solicitudes = database.getReference("Users").child(chat.getEnvia());
            ref_mis_solicitudes.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    if (dataSnapshot.exists()) {
                        userss[0] = dataSnapshot.getValue(Users.class);
                        Glide.with(context).load(userss[0].getFoto()).into(holder.img_user);
                        if (user.getUid().equals(userss[0].getId())) {
                            System.out.println("isklhgjj");
                            holder.cardView.getBackground().setTint(Color.CYAN);
                            holder.tv_usuario.setTextColor(Color.BLACK);
                        } else {
                            holder.cardView.getBackground().setTint(ContextCompat.getColor(context, R.color.colorNaranja));
                            holder.tv_usuario.setTextColor(Color.WHITE);
                        }
                    } else {

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }catch (Exception e){
            System.out.println("Error en: " + e);
        }
    }

    @Override
    public int getItemCount() {
        return chatsList.size();
    }

    /**
     * The type View holder adaptermensajelist.
     */
    public class viewHolderAdaptermensajelist extends RecyclerView.ViewHolder {
        /**
         * The Tv usuario.
         */
        TextView tv_usuario;
        /**
         * The Img user.
         */
        ImageView img_user;
        /**
         * The Card view.
         */
        CardView cardView;
        /**
         * The Mensaje foto.
         */
        ImageView mensajeFoto;

        /**
         * Instantiates a new View holder adaptermensajelist.
         *
         * @param itemView the item view
         */
        public viewHolderAdaptermensajelist(@NonNull View itemView) {
            super(itemView);
            tv_usuario=itemView.findViewById(R.id.tv_user);
            img_user=itemView.findViewById(R.id.img_user);
            cardView=itemView.findViewById(R.id.cardViewMe);
            mensajeFoto=itemView.findViewById(R.id.img_vista);
        }
    }
}
