package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    Button calcutate;

    TextView result;

    ConstraintLayout backcard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.edittext);
        height=findViewById(R.id.edittext1);
        calcutate=findViewById(R.id.button);
        result=findViewById(R.id.textview3);
        backcard=findViewById(R.id.backcard);

        calcutate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w=Double.parseDouble(weight.getText().toString());
                double h=Double.parseDouble(height.getText().toString());
                double bmi=w/(h*h);
                if (bmi<18.5){
                    backcard.setBackgroundColor(getColor(R.color.gold));
                }
                else if (bmi>=18.5 && bmi<24.9){
                    backcard.setBackgroundColor(getColor(R.color.green));
                }
                else if (bmi>=25 && bmi<29.9){
                    backcard.setBackgroundColor(getColor(R.color.orange));
                }
                else{
                    backcard.setBackgroundColor(getColor(R.color.darkred));
                }
                result.setText(String.format("%.2f",bmi));
            }
        });

    }
}