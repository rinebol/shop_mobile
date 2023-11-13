package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.register);
        EditText Username = (EditText)findViewById(R.id.username);
        EditText Password = findViewById(R.id.Password);
        Button lloginbt= findViewById(R.id.Signin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this,Register.class);
                startActivity(switcher);
            }
        });

        lloginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this,Register.class);
                startActivity(switcher);
            }
        });
        EditText username, password;
        Button btnlogin;
        BD DB;

            username = (EditText) findViewById(R.id.username);
            password = (EditText) findViewById(R.id.Password);
            btnlogin = (Button) findViewById(R.id.Signin);
            DB = new BD(this);

            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String user = username.getText().toString();
                    String pass = password.getText().toString();

                    if(user.equals("")||pass.equals(""))
                        Toast.makeText(MainActivity.this, "Заполните все поля", Toast.LENGTH_SHORT).show();
                    else{
                        Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                        if(checkuserpass==true){
                            Toast.makeText(MainActivity.this, "Вход прошел успешно", Toast.LENGTH_SHORT).show();
                            Intent intent  = new Intent(getApplicationContext(), Login.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(MainActivity.this, "Неверные данные", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }
    }

