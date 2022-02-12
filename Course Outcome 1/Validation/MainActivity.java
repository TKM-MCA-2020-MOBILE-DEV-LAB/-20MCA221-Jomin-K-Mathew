package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Boolean validateName(){
        EditText ed1 = (EditText) findViewById(R.id.name);
        String name = ed1.getText().toString();
        if (name.isEmpty()){
            ed1.setError("Name cannot be empty");
            return false;
        }
        else {
            return true;
        }
    }
    public Boolean validateAddress(){
        EditText ed5 = (EditText) findViewById(R.id.address);
        String address = ed5.getText().toString();
        if (address.isEmpty()){
            ed5.setError("Address cannot be empty");
            return false;
        }
        else {
            return true;
        }
    }
    public  Boolean validateEmail(){
        EditText ed2 = (EditText) findViewById(R.id.email);
        String email = ed2.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (email.isEmpty()){
            ed2.setError("Email cannot be empty");
            return false;
        }
        else if (!email.matches(emailPattern)){
            ed2.setError("Invalid email address");
            return false;
        }
        else{
            return true;
        }
    }
    public Boolean validateNumber() {
        EditText ed3 = (EditText) findViewById(R.id.number);
        String num = ed3.getText().toString();
        String numval = ".{10,}";
        if (num.isEmpty()) {
            ed3.setError("Phone number cannot be empty");
            return false;
        } else if (!num.matches(numval)) {
            ed3.setError("Check it exist 10 numbers");
            return false;
        } else {
            return true;
        }
    }
    public  Boolean validatePassword(){
        EditText ed4 = (EditText) findViewById(R.id.password);
        String pswd = ed4.getText().toString();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";
        if (pswd.isEmpty()){
            ed4.setError("Password cannot be empty");
            return false;
        }
        else if (!pswd.matches(passwordVal)) {
            ed4.setError("Password is too weak");
            return false;
        }
        else{
            return true;
        }
    }
    public void onSubmit(View view){
        if(validateName() && validateEmail() && validateNumber() && validateAddress() && validatePassword()){
            Toast t = Toast.makeText(getApplicationContext(),"Succesfully Submitted",Toast.LENGTH_LONG);
            t.show();
        }
    }
}