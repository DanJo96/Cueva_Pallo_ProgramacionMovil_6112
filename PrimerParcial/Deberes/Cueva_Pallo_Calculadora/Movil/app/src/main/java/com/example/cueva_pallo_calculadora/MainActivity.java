/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/

package com.example.cueva_pallo_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Modelo.Operaciones;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Btn cero.
     */
    Button btnCero, /**
     * The Btn uno.
     */
    btnUno, /**
     * The Btn dos.
     */
    btnDos, /**
     * The Btn tres.
     */
    btnTres, /**
     * The Btn cuatro.
     */
    btnCuatro, /**
     * The Btn cinco.
     */
    btnCinco, /**
     * The Btn seis.
     */
    btnSeis, /**
     * The Btn siete.
     */
    btnSiete, /**
     * The Btn ocho.
     */
    btnOcho,
    /**
     * The Btn nueve.
     */
    btnNueve, /**
     * The Btn punto.
     */
    btnPunto, /**
     * The Btn igual.
     */
    btnIgual, /**
     * The Btn suma.
     */
    btnSuma, /**
     * The Btn resta.
     */
    btnResta, /**
     * The Btn multi.
     */
    btnMulti, /**
     * The Btn div.
     */
    btnDiv, /**
     * The Btn limpiar.
     */
    btnLimpiar, /**
     * The Btn mn.
     */
    btnMN, /**
     * The Btn mp.
     */
    btnMP, /**
     * The Btn mr.
     */
    btnMR;
    /**
     * The Et proceso.
     */
    EditText etProceso, /**
     * The Etconcatenar.
     */
    etconcatenar;
    /**
     * The Numero 1.
     */
    double numero1, /**
     * The Numero 2.
     */
    numero2, /**
     * The Resultado.
     */
    resultado;
    /**
     * The Opera.
     */
    Operaciones opera;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opera= new Operaciones();
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnCero = (Button)findViewById(R.id.btnCero);
        btnUno = (Button)findViewById(R.id.btnUno);
        btnDos = (Button)findViewById(R.id.btnDos);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnCuatro = (Button)findViewById(R.id.btnCuatro);
        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSiete = (Button)findViewById(R.id.btnSiete);
        btnOcho = (Button)findViewById(R.id.btnOcho);
        btnNueve = (Button)findViewById(R.id.btnNueve);
        btnPunto = (Button)findViewById(R.id.btnPunto);
        btnIgual = (Button)findViewById(R.id.btnIgual);
        btnSuma = (Button)findViewById(R.id.btnSuma);
        btnResta = (Button)findViewById(R.id.btnResta);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnMN = (Button)findViewById(R.id.btnMN);
        btnMP = (Button)findViewById(R.id.btnMP);
        btnMR = (Button)findViewById(R.id.btnMR);
        etProceso = (EditText)findViewById(R.id.etProceso);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");

            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero2(Double.parseDouble(etconcatenar.getText().toString()));
                    etProceso.setText("");
                    Double res=opera.realizarOperacion();
                    if(res==null){
                        Toast M1 = Toast.makeText(getApplicationContext(),"No existe división para 0", Toast.LENGTH_LONG);
                        M1.show();
                    }
                    else {
                        etProceso.setText(String.valueOf(res));
                    }
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    opera.setOperador("+");
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    opera.setOperador("-");
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    opera.setOperador("*");
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    opera.setOperador("/");
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    opera.operacionMP();
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnMN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    opera.setNumero1(Double.parseDouble(etconcatenar.getText().toString()));
                    opera.operacionMN();
                    etProceso.setText("");
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    opera.setOperador("MR");
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    etProceso.setText(""+opera.getM());
                }catch (Exception e){
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }

            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }
}
