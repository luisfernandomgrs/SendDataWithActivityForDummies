package com.luisfernandomgrs.learning.senddatawithactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textName, textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setTitle("Exibindo suas informações entre Activity");

        textName = this.findViewById(R.id.textName);
        textAge = this.findViewById(R.id.textAge);

        // get dada from the previous component activity
        Bundle dataActivityPrevious = getIntent().getExtras();
        // settings values
        String _Name = dataActivityPrevious.getString("Name");
        int _Age = dataActivityPrevious.getInt("Age");
        User dataUser = (User) dataActivityPrevious.getSerializable("objectData");

        // settings values from data recovered...
        textName.setText(dataUser.getName());
        textAge.setText(String.valueOf(_Age));
    }
}