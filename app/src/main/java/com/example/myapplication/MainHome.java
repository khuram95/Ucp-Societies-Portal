package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainHome extends AppCompatActivity {
    TextView DisplayData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        DisplayData=findViewById(R.id.home_textview);
        //SharedPrefe3rences sharedPref=getSharedPreferences("UserData", Context.MODE_PRIVATE);
        //String name=sharedPref.getString("username","");
        DisplayData.setText("Welcome ");

        String[] societies = {"Blood Donor`s Society","IEEE","Islamic Guidance Club", "Dramatics","Plektra"};
        ListView mylistview = findViewById(R.id.listview1);
        ArrayAdapter myAdapter = new customAdapter(this,societies);
        mylistview.setAdapter(myAdapter);

        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String Society = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainHome.this,Society,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void sendBacktoMain(View view)
    {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
