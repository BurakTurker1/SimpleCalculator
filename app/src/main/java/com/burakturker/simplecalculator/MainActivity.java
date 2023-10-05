package com.burakturker.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1text = findViewById(R.id.number1text);
        number2text = findViewById(R.id.Number2Text);
        resultText = findViewById(R.id.ResultText);
    }

    public void sum(View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Please enter your number");
        }else {
            int number1 = Integer.parseInt(number1text.getText().toString()) ;
            int number2 = Integer.parseInt(number2text.getText().toString()) ;
            int result = number1 + number2;
            resultText.setText("result: "+ result);
        }

    }
    public void multiply(View view){
        if (number1text.getText().toString().matches("") ||number2text.getText().toString().matches("")){
            resultText.setText("Please enter your number");
        }else {
            int number1 = Integer.parseInt(number1text.getText().toString()) ;
            int number2 = Integer.parseInt(number2text.getText().toString()) ;
            int result = number1 * number2;
            resultText.setText("result: "+ result);
        }

    }
    public void deduct(View view){
        if (number1text.getText().toString().matches("") ||number2text.getText().toString().matches("")){
            resultText.setText("Please enter your number");
        }else {
            int number1 = Integer.parseInt(number1text.getText().toString()) ;
            int number2 = Integer.parseInt(number2text.getText().toString()) ;
            int result = number1 - number2;
            resultText.setText("result: "+ result);
        }

    }
    public void divide(View view){
        if (number1text.getText().toString().matches("") ||number2text.getText().toString().matches("")){
            resultText.setText("Please enter your number");
        }else {
            int number1 = Integer.parseInt(number1text.getText().toString()) ;
            int number2 = Integer.parseInt(number2text.getText().toString()) ;
            int result = number1 / number2;
            resultText.setText("result: "+ result);
        }

    }
}