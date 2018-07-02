package com.example.hp.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void WelcomeScreen(View view)
    {
        Intent i = new Intent(this, Welcome.class);
        startActivity(i);
    }
    public void DataMove(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        String message= editText.getText().toString();
        Intent i = new Intent(this, Welcome.class);
        i.putExtra("Extra_Message",message);
        startActivity(i);
    }

    public void animatedperview(View view){
        Intent i = new Intent(this, Welcome.class);
        startActivity(i);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

}
