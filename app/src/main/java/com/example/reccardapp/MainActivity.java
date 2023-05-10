package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
      //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Puncak Ilmu adalah Akhklak");
        ob1.setDesc("DESKRIPSI.....");
        ob1.setImgname(R.drawable.book1);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Semua Orang Butuh Curhat");
        ob2.setDesc("DESKRIPSI.....");
        ob2.setImgname(R.drawable.book2);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Menggapai Proses");
        ob3.setDesc("DESKRIPSI.....");
        ob3.setImgname(R.drawable.book3);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("SABAR");
        ob4.setDesc("DESKRIPSI.....");
        ob4.setImgname(R.drawable.book4);
        holder.add(ob4);



        return holder;
    }


}
