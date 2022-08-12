package com.example.amb_app_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView T1 = findViewById(R.id.T1);
        TextView T2 = findViewById(R.id.T2);
        EditText ET1 = findViewById(R.id.ET1);
        EditText ET2 = findViewById(R.id.ET2);
        Button sfra = findViewById(R.id.B);

        sfra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ET11 = ET1.getText().toString();
                int ET22 = Integer.parseInt(ET2.getText().toString());

                Intent sfra = new Intent(MainActivity.this , P2.class);

                sfra.putExtra("name" ,ET11);
                sfra.putExtra("age" ,ET22);

                startActivity(sfra);
            }
        });

    }
}