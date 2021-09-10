package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Libro> libros = new ArrayList();
        libros.add(new Libro("The owl house","Dana terrance"));
        libros.add(new Libro("Gravity falls","george"));
        libros.add(new Libro("The owl house","Dana terrance"));
        libros.add(new Libro("Gravity falls","george"));
        libros.add(new Libro("The owl house","Dana terrance"));
        libros.add(new Libro("Gravity falls","george"));
        libros.add(new Libro("The owl house","Dana terrance"));
        libros.add(new Libro("Gravity falls","george"));
        libros.add(new Libro("The owl house","Dana terrance"));
        libros.add(new Libro("Gravity falls","george"));



        ListAdapter adapter = new ListAdapter(libros,this);
        RecyclerView miRecycler =findViewById(R.id.myRecycler);
        miRecycler.setLayoutManager(new LinearLayoutManager(this));
        miRecycler.setAdapter(adapter);
    }
}