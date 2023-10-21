package com.example.toplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputEditText;

    private int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);



        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof Button) {
                    Button clickedButton = (Button) v;
                    String buttonText = clickedButton.getText().toString();
                    if (!inputEditText.getText().toString().isEmpty()) {


                        buttonText=inputEditText.getText()+"+" +buttonText;

                        inputEditText.setText( buttonText);
                    }
                    else {
                        inputEditText.setText(buttonText);
                    }


                }
            }
        };


        button0.setOnClickListener(buttonClickListener);
        button1.setOnClickListener(buttonClickListener);
        button2.setOnClickListener(buttonClickListener);
        button3.setOnClickListener(buttonClickListener);
        button4.setOnClickListener(buttonClickListener);
        button5.setOnClickListener(buttonClickListener);
        button6.setOnClickListener(buttonClickListener);
        button7.setOnClickListener(buttonClickListener);
        button8.setOnClickListener(buttonClickListener);
        button9.setOnClickListener(buttonClickListener);

        Button clearButton = findViewById(R.id.temizleBtn);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputEditText.setText("");
                total = 0;

            }
        });

        // Sonuç düğmesi
        Button calculateButton = findViewById(R.id.hesaplaBtn);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputEditText.getText().toString();
                if (!input.isEmpty()) {
                    String[] sayilar = input.split("\\+");
                    int topla = 0;

                    for (String sayi : sayilar) {
                        topla += Integer.parseInt(sayi);
                    }
                    inputEditText.setText( String.valueOf(topla));
                } else {
                    inputEditText.setText("Hata");
                }
            }
        });
    }


}