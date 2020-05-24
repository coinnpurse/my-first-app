package com.coinnpursecoding.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn); //Searches through id for add button
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

        Button subBtn = (Button) findViewById((R.id.subBtn)); //Searches through id for sub button
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText thirdNumEditText = (EditText) findViewById(R.id.thirdNumEditText); //assign thirdNumEditText to an EditText variable
                EditText fourthNumEditText = (EditText) findViewById(R.id.fourthNumEditText); //assign fourthNumEditText to an EditText variable
                TextView result2TextView = (TextView) findViewById(R.id.result2TextView); //assign result2TextView to a TextView variable

                int num3 = Integer.parseInt(thirdNumEditText.getText().toString()); //parses input(makes it a string)
                int num4 = Integer.parseInt(fourthNumEditText.getText().toString());
                int result2 = num3 - num4;
                result2TextView.setText(result2 + ""); //concatenate because the .setText() will only take a string
            }
        });



    }
}
