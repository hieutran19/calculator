package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView resulttext;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight =findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resulttext=findViewById(R.id.result);
    }
    public void calculateBMI(View view) {
        String s1=weight.getText().toString();
        String s2=height.getText().toString();
        float weightValue = Float.parseFloat(s1);
        float heightValue = Float.parseFloat(s2)/100;
        float bmi= weightValue/(heightValue*heightValue);

        calculation="Result \n"+ bmi;
        resulttext.setText(calculation);
    }
}