package com.example.calculatorapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        private TextView textView;
        private String currentInput = "";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = findViewById(R.id.textView);

            findViewById(R.id.button_0).setOnClickListener(v -> appendNumber("0"));
            findViewById(R.id.button_1).setOnClickListener(v -> appendNumber("1"));
            findViewById(R.id.button_2).setOnClickListener(v -> appendNumber("2"));
            findViewById(R.id.button_3).setOnClickListener(v -> appendNumber("3"));
            findViewById(R.id.button_4).setOnClickListener(v -> appendNumber("4"));
            findViewById(R.id.button_5).setOnClickListener(v -> appendNumber("5"));
            findViewById(R.id.button_6).setOnClickListener(v -> appendNumber("6"));
            findViewById(R.id.button_7).setOnClickListener(v -> appendNumber("7"));
            findViewById(R.id.button_8).setOnClickListener(v -> appendNumber("8"));
            findViewById(R.id.button_9).setOnClickListener(v -> appendNumber("9"));


            findViewById(R.id.button_equal).setOnClickListener(v -> calculateResult());
            findViewById(R.id.button_AC).setOnClickListener(v -> clearInput());
        }

        private void appendNumber(String number) {
            currentInput += number;
            textView.setText(currentInput);
        }

        private void calculateResult() {
        }

        private void clearInput() {
            currentInput = "";
            textView.setText("0");
        }
}