package com.example.externalexamgrid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder=new AlertDialog.Builder(this);
    }
    public void onc(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:Plus");
        alertDialog.show();
    }
    public void oncl(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:send");
        alertDialog.show();
    }
    public void oncli(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:star");
        alertDialog.show();
    }
    public void onclic(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:calendar");
        alertDialog.show();
    }

}