package com.example.monitoringpressure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Save();
        Pressure();
        Health();


    }
    private void Save(){
        Button btnSa = findViewById(R.id.btnSa);
        btnSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int AgeValue = 0;
                String Name;

                try {

                    EditText txtAgeValue = findViewById(R.id.txAge);
                    String AgeString = txtAgeValue.getText().toString();
                    AgeValue = Integer.parseInt(AgeString);
                }
                catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this,"Введенны неверные данные", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void Pressure(){
        Button btnPre = findViewById(R.id.btnPre);
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityPressure.class );
                startActivity(intent);
            }
        });
    }
    private void Health(){
        Button btnHe = findViewById(R.id.btnHe);
        btnHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityHealth.class );
                startActivity(intent);
            }
        });
    }
}

