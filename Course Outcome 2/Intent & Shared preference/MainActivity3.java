package com.example.storedetail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView t1 = (TextView) findViewById(R.id.text1);
        TextView t2 = (TextView) findViewById(R.id.text2);
        TextView t3 = (TextView) findViewById(R.id.text3);
        Bundle extras = getIntent().getExtras();
        String text1 = extras.getString("Name");
        String text2 = extras.getString("Phone");
        String text3 = extras.getString("Email");
        t1.setText(text1);
        t2.setText(text2);
        t3.setText(text3);
    }
    public void onSubmit(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}