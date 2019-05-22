package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText nameInput;
    EditText usernameInput;
    EditText pwInput;
    EditText emailInput;
    EditText contactInput;
    EditText semesterInput;
    EditText DepartmentInput;
    EditText optionInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        nameInput=findViewById(R.id.name);
        usernameInput=findViewById(R.id.usernameText);
        pwInput=findViewById(R.id.pw);
        emailInput=findViewById(R.id.emailText);
        contactInput=findViewById(R.id.contactText);
        semesterInput=findViewById(R.id.smstrText);
        DepartmentInput=findViewById(R.id.departmentText);
        optionInput=findViewById(R.id.optionText);
    }
    public void sendBacktoMain(View view)
    {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void sendtoHome(View view)
    {
        //if(optionInput.getText().toString().equals("user") || optionInput.getText().toString().equals("User")) {
            /*SharedPreferences sharedPref=getSharedPreferences("UserData", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPref.edit();
            editor.putString("name", nameInput.getText().toString());
            editor.putString("username", usernameInput.getText().toString());
            //String email = emailInput.getText().toString().trim();
            //String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            //if (email.matches(emailPattern))
            //{
                //Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                editor.putString("email",emailInput.getText().toString());
                editor.putString("password", pwInput.getText().toString());
                editor.putInt("contact",Integer.parseInt(contactInput.getText().toString()));
                editor.putString("Department", DepartmentInput.getText().toString());
                editor.putInt("semester",Integer.parseInt(semesterInput.getText().toString()));
                editor.putString("Admin/User", DepartmentInput.getText().toString());
                editor.apply();*/
                Toast.makeText(this,"Account has been created",Toast.LENGTH_LONG).show();
                Intent i= new Intent(this, Home.class);
                startActivity(i);
            //}
            //else
            //{
                //Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
            //}

        }
       /* else if(opt || optionInput.getText().toString().equals("User"))
        {
            SharedPreferences sharedPref=getSharedPreferences("AdminData", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPref.edit();
            editor.putString("name", nameInput.getText().toString());
            editor.putString("username", usernameInput.getText().toString());
           // String email = emailInput.getText().toString().trim();
            //String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
           // if (email.matches(emailPattern))
            //{
                //Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                editor.putString("email",emailInput.getText().toString());
                editor.putString("password", pwInput.getText().toString());
                editor.putInt("contact",Integer.parseInt(contactInput.getText().toString()));
                editor.putString("Department", DepartmentInput.getText().toString());
            editor.putInt("semester",Integer.parseInt(semesterInput.getText().toString()));
                editor.apply();
                Toast.makeText(this,"Account has been created",Toast.LENGTH_LONG).show();
                Intent i= new Intent(this, AdminHome.class);
                startActivity(i);
            //}
            //else
            //{
                Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
            //}
        }*/

    }
