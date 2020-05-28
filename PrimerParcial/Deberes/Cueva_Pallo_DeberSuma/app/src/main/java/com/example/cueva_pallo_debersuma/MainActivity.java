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
import Modelo.Suma;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText T1;
    EditText T2;
    EditText Res;
    Button B1;
    Button B2;
    Button B3;
    Suma S1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = (EditText) findViewById(R.id.txtNum1);
        T2 = (EditText) findViewById(R.id.txtNum2);
        Res = (EditText) findViewById(R.id.txtRes);
        B1 = (Button) findViewById(R.id.btnSumar);
        B2 = (Button) findViewById(R.id.btnLimpiar);
        B3 = (Button) findViewById(R.id.btnResta);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        S1 = new Suma();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnSumar:
                try
                {
                    S1.setNum1(Double.parseDouble(T1.getText().toString()));
                    S1.setNum2(Double.parseDouble(T2.getText().toString()));
                    Res.setText(""+S1.operationsSum());
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
                    S1.setNum1(Double.parseDouble(T1.getText().toString()));
                    S1.setNum2(Double.parseDouble(T2.getText().toString()));
                    Res.setText(""+S1.operationsRes());
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

                break;
        }




    }
}
