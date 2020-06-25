/************************************
 *  Programa: Calculadora Básica    *
 * Autores: Cueva - Pallo           *
 * Fecha Creación: 26/05/2020       *
 * Fecha Modificación:  05/05/2020  *
 * Carrera: Sistemas e Informática  *
 * Profesor: Ing. Fernando Solis    *
 ***********************************/

package com.example.cueva_pallo_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import Modelo.Operaciones;

public class GraficarActivity extends AppCompatActivity
{
    private LineGraphSeries<DataPoint> series;
    private GraphView function;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficar);
        String recuperado=getIntent().getStringExtra("key1");
        Operaciones operaciones=new Operaciones();
        function=findViewById(R.id.graphViewFunction);
        function.getViewport().setScrollable(true);
        function.getViewport().setScrollableY(true);
        function.getViewport().setScalable(true);
        function.getViewport().setScalableY(false);
        function.getViewport().setXAxisBoundsManual(true);
        function.getViewport().setMinX(-200);
        function.getViewport().setMaxX(200);
        function = operaciones.dibujarSin(recuperado,function);

    }


}