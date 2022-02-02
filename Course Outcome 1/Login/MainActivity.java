package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.password);
        b1=(Button)findViewById((R.id.login));
    }
    public void onClick(View view){
        String a =t1.getText().toString();
        String b =t2.getText().toString();
        if((a.equals("admin"))&&(b.equals("admin")))
        {
            Toast.makeText(this,"Succesfully Logined",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Check username & password",Toast.LENGTH_LONG).show();
        }
    }
}