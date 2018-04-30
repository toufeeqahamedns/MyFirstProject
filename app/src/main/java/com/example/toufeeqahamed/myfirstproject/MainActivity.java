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

        //Find the view that shows Family category
        TextView family = (TextView) findViewById(R.id.family);

        //Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //Start new activity
                startActivity(familyIntent);
            }
        });

        //Find the view that shows Colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //Start new activity
                startActivity(colorsIntent);
            }
        });

        //Find the view that shows Phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //Start new activity
                startActivity(phrasesIntent);
            }
        });
    }
}
