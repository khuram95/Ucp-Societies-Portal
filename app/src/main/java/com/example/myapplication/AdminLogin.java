package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        username=findViewById(R.id.admuserText);
        password=findViewById(R.id.admpswrdText);
    }
    public void sendtoAdmHome(View view)
    {
        SharedPreferences sharedPref=getSharedPreferences("AdminData", Context.MODE_PRIVATE);
        String Uname=sharedPref.getString("username","");
        String Pname=sharedPref.getString("password","");
        if(username.getText().toString().equals(Uname) && password.getText().toString().equals(Pname))
        {
            if(Uname.equals("") || Pname.equals(""))
            {
                Toast.makeText(this,"Field is empty",Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, AdminHome.class);
                startActivity(i);
            }
        }
        else
        {
            Toast.makeText(this, "Account does not exist", Toast.LENGTH_LONG).show();
        }
    }
}
