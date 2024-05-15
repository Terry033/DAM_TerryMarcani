package com.example.dam_terrymarcani;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn1 = findViewById(R.id.send);
        btn1.setOnClickListener(view -> {
            Toast.makeText(this, "Se ha enviado correctamente", Toast.LENGTH_SHORT).show();
        });
    }
}
