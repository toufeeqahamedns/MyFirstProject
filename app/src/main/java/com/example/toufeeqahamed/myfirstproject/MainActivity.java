package com.example.toufeeqahamed.myfirstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows Numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Start new activity
                startActivity(numbersIntent);
            }
        });
    }
}
