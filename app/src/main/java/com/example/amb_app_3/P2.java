package com.example.amb_app_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        TextView T7 = findViewById(R.id.T7);
        TextView T8 = findViewById(R.id.T8);


        Bundle BB = getIntent().getExtras();

        String ET11 = BB.getString("name");
        T7.setText(ET11);

        int ET22 = BB.getInt("age");
        T8.setText("" + ET22);

    }
}