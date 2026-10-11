package com.example.a11_10_2;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);

        // wspólny listener dla +1 i −1
        View.OnClickListener changeListener = v -> {
            if (v.getId() == R.id.btnPlus) {
                count++;
                tvCount.setText(String.valueOf(count));
            } else if (v.getId() == R.id.btnMinus) {
                count--;
                tvCount.setText(String.valueOf(count));
            }
        };

        findViewById(R.id.btnPlus).setOnClickListener(changeListener);
        findViewById(R.id.btnMinus).setOnClickListener(changeListener);
    }
}