package com.example.chat_cuevapallo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
/***********************************************
 *  Programa: Calculadora Básica               *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  05/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity
{
    private FirebaseAuth mfirebaseAuth;
    private FirebaseAuth.AuthStateListener mautListener;
    /**
     * The constant SIGN_IN.
     */
    public static final int SIGN_IN=1;
    /**
     * The Providers.
     */
    List<AuthUI.IdpConfig> providers = Arrays.asList(
        new AuthUI.IdpConfig.GoogleBuilder().build()
    );


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setTheme(R.style.SpashTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfirebaseAuth = FirebaseAuth.getInstance();
        mautListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user !=null){
                    vamosaHome();
                }
                else{
                    startActivityForResult(
                            AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(providers)
                            .setIsSmartLockEnabled(false)
                            .build(),SIGN_IN
                    );
                }
            }


        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        mfirebaseAuth.addAuthStateListener(mautListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mfirebaseAuth.removeAuthStateListener(mautListener);
    }
    private void vamosaHome() {
        try {
            Intent i = new Intent(this, homeActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
