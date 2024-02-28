package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    Button pulsante2 = findViewById(R.id.pulsante2);
    pulsante2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Activity2.this, "Hai cliccato il pulsante nella seconda Activity!", Toast.LENGTH_SHORT).show();
        }
    });

        Toast.makeText(this, "Questo pulsante ti porta nell'Activity 2", Toast.LENGTH_SHORT).show();
    }
}