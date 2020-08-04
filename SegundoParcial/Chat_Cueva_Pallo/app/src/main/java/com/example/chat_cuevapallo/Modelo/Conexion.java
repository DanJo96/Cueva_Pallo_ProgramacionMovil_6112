package com.example.chat_cuevapallo.Modelo;

import android.content.SharedPreferences;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Clase que permite realizar conexiones a la base de datos
 */
public class Conexion {
    /**
     * The User. usuario actual
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
     * Instantiates a new Conexion.
     */
    public Conexion() {
    }

    /**
     * Instantiates a new Conexion.
     *
     * @param user     the user
     * @param database the database
     * @param mPref    the m pref
     */
    public Conexion(FirebaseUser user, FirebaseDatabase database, SharedPreferences mPref) {
        this.user = user;
        this.database = database;
        this.mPref = mPref;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public FirebaseUser getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(FirebaseUser user) {
        this.user = user;
    }

    /**
     * Gets database.
     *
     * @return the database
     */
    public FirebaseDatabase getDatabase() {
        return database;
    }

    /**
     * Sets database.
     *
     * @param database the database
     */
    public void setDatabase(FirebaseDatabase database) {
        this.database = database;
    }

    /**
     * Gets pref.
     *
     * @return the pref
     */
    public SharedPreferences getmPref() {
        return mPref;
    }

    /**
     * Sets pref.
     *
     * @param mPref the m pref
     */
    public void setmPref(SharedPreferences mPref) {
        this.mPref = mPref;
    }

    /**
     * Obtener conexion.
     */
    public void obtenerConexion(){
        try {
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ref_user = database.getReference("Users").child(user.getUid());
            DatabaseReference ref_solicitud_count = database.getReference("Contador").child(user.getUid());
            DatabaseReference ref_estado = database.getReference("Estado").child(user.getUid());
        }catch (Exception e){
            System.out.println("Error en la conexion");
        }
    }


}
