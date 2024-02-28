package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pulsante1 = findViewById(R.id.pulsante1);
        pulsante1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(MainActivity.this, "Hai premuto il Pulsante 1", Toast.LENGTH_SHORT).show();
            }
        });

        Button pulsante2 = findViewById(R.id.pulsante2);
        pulsante2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.tasto1 ){
            Toast.makeText(this, "Hai usato il tasto 1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.tasto2){
            Toast.makeText(this, "Hai usato il tasto 2", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.tasto3 ) {
            Toast.makeText(this, "Hai usato il tasto 3", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}