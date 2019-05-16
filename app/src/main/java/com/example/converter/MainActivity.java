package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
double currencyExchangeRate ;







        public void convertButtonAction(View view){

            ToggleButton toggleButton = (ToggleButton) findViewById(R.id.switchCurrencies);

            if(toggleButton.isChecked()){
                toggleButton.setText("jest");
                currencyExchangeRate = 4.93;

            }
    else {
        currencyExchangeRate = 0.20;
    }


    EditText currencyToConvertEditText = (EditText) findViewById(R.id.currencyToConvertEditText);
String  currencyToConvert = currencyToConvertEditText.getText().toString();
    double currencyToConv= Double.parseDouble(currencyToConvert);
    double result = currencyToConv*currencyExchangeRate;

    Log.i("Działa", String.valueOf(result));
TextView currencyAfterConversionTextView = (TextView) findViewById(R.id.currencyAfterConversionTextView);
currencyAfterConversionTextView.setText(Double.toString(result));
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}
