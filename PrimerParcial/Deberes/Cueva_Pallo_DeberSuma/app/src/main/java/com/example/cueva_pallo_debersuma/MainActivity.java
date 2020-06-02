/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 ************************************************/

package com.example.cueva_pallo_debersuma;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import Modelo.OperacionesBasicas;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    /**
     * The T 1.
     */
    EditText T1;
    /**
     * The T 2.
     */
    EditText T2;
    /**
     * The Res.
     */
    EditText Res;
    /**
     * The B 1.
     */
    Button B1;
    /**
     * The B 2.
     */
    Button B2;
    /**
     * The B 3.
     */
    Button B3;
    /**
     * The B 4.
     */
    Button B4;
    /**
     * The B 5.
     */
    Button B5;
    /**
     * The S 1.
     */
    OperacionesBasicas S1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = (EditText) findViewById(R.id.txtNum1);
        T2 = (EditText) findViewById(R.id.txtNum2);
        Res = (EditText) findViewById(R.id.txtRes);
        B1 = (Button) findViewById(R.id.btnSumar);
        B2 = (Button) findViewById(R.id.btnLimpiar);
        B3 = (Button) findViewById(R.id.btnResta);
        B4 = (Button) findViewById(R.id.btnMultiplicacion);
        B5 = (Button) findViewById(R.id.btnDivision);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        S1 = new OperacionesBasicas();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnSumar:
                try
                {

                    Res.setText(""+S1.operationsSum(Double.parseDouble(T1.getText().toString()),Double.parseDouble(T2.getText().toString())));
                }
                catch (Exception e)
                {
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
                break;

            case R.id.btnResta:
                try
                {

                    Res.setText(""+S1.operationsRes(Double.parseDouble(T1.getText().toString()),Double.parseDouble(T2.getText().toString())));
                }
                catch (Exception e)
                {
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
                break;

            case R.id.btnMultiplicacion:
                try
                {
                    Res.setText(""+S1.operationsMul(Double.parseDouble(T1.getText().toString()),Double.parseDouble(T2.getText().toString())));
                }
                catch (Exception e)
                {
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
                break;
            case R.id.btnDivision:
                try
                {

                    if(S1.operationsDiv(Double.parseDouble(T1.getText().toString()),Double.parseDouble(T2.getText().toString()))==null){
                        Toast M1 = Toast.makeText(getApplicationContext(),"No existe división para 0", Toast.LENGTH_LONG);
                        M1.show();
                    }
                    else
                        Res.setText(""+S1.operationsDiv(Double.parseDouble(T1.getText().toString()),Double.parseDouble(T2.getText().toString())));
                }
                catch (Exception e)
                {
                    Toast M1 = Toast.makeText(getApplicationContext(),"Datos Invàlidos", Toast.LENGTH_LONG);
                    M1.show();
                }
                break;

            case R.id.btnLimpiar:
                T1.setText(" ");
                T2.setText(" ");
                Res.setText(" ");
                T1.setFocusable(true);

                break;
        }




    }
}
