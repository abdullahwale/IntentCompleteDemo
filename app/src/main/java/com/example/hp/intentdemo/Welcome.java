package com.example.hp.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        }


        public void GoTHirdActivity(View view){
            Intent intent= new Intent(this, Third.class);
            startActivity(intent);

        }


        public void RecieveData(View view){
        Intent intent=getIntent();
        String getMessage=intent.getStringExtra("Extra_Message");
            TextView textView=(TextView) findViewById(R.id.tvgetData);
            textView.setText(getMessage);
    }

}
