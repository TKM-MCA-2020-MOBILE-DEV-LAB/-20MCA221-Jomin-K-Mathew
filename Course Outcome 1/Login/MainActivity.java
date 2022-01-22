package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.password);
        b1=(Button)findViewById(R.id.login);
    }

    public void fn(View view) {
        String n = e1.getText().toString();
        String w = e2.getText().toString();
        if((n.equals("admin"))&&(w.equals("admin")))
        {
            Toast.makeText(this, "Succesfully logined", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Unable to login check username & password", Toast.LENGTH_SHORT).show();
        }

    }
}