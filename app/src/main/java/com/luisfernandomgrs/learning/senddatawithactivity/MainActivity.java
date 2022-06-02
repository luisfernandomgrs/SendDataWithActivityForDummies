package com.luisfernandomgrs.learning.senddatawithactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonSendData;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Enviando informações entre Activity");
        buttonSendData = this.findViewById(R.id.buttonSendData);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                // Get a class/object
                User myUser = new User("Luis Fernando :)", "nosendmail_luis@gmail.com");

                // sending data between activity's
                intent.putExtra("Name", "Luis Fernando");
                intent.putExtra("Age", 45);
                intent.putExtra("objectData", myUser);

                startActivity(intent);
            }
        });
    }
}