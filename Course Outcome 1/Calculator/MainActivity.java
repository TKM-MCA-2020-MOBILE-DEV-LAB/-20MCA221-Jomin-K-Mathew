package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        e3=(EditText)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mult);
        b4=(Button)findViewById(R.id.div);
    }
    public void add(View view)
    {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        String c=String.valueOf(a+b);
        e3.setText(c);
    }
    public void sub(View view)
    {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        String c=String.valueOf(a-b);
        e3.setText(c);
    }
    public void mult(View view)
    {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        String c=String.valueOf(a*b);
        e3.setText(c);
    }
    public void div(View view)
    {
        float a=Integer.parseInt(e1.getText().toString());
        float b=Integer.parseInt(e2.getText().toString());
        String c=String.valueOf(a/b);
        e3.setText(c);
    }
}