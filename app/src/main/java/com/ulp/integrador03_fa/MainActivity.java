package com.ulp.integrador03_fa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> list=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();

    }

    private void cargarDatos(){
        list.add(new Item(R.drawable.perro1,1));
        list.add(new Item(R.drawable.perro2,2));
        list.add(new Item(R.drawable.perro3,3));


    }

    private void generarVista(){
        ArrayAdapter<Item> adapter=new AdapterLista(list,this );
        ListView lv=(ListView) findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

}
