package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R.id;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText Username = (EditText)findViewById(id.lusername);
        EditText Password = findViewById(id.lPassword);
        Button ButtonSign = findViewById(R.id.Sign);
        Button lloginbt= findViewById(R.id.lloginbt);

        ButtonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(Register.this,MainActivity.class);
                startActivity(switcher);
            }
        });

        EditText username, password, repassword;
        Button signup, signin;
        BD DB;

        username = (EditText) findViewById(R.id.lusername);
        password = (EditText) findViewById(R.id.lPassword);
        repassword = (EditText) findViewById(id.repass);
        signin = (Button) findViewById(R.id.lloginbt);
        DB = new BD(this);

        lloginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(Register.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(Register.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                              //  Intent intent = new Intent(getApplicationContext(),Login.class);
                                //startActivity(intent);
                            }else{
                                Toast.makeText(Register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Register.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Register.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });


    }
}






