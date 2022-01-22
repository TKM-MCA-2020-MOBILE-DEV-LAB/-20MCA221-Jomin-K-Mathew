package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.name1);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.Date);
        b1=findViewById(R.id.reg);
    }
    public void buttonclick(View view)
    {
        String n=e1.getText().toString();
        String e=e2.getText().toString();
        Toast.makeText(this, "Succesfully Registered ", Toast.LENGTH_SHORT).show();
    }
}