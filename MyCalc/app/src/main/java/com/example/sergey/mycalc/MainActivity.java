package com.example.sergey.mycalc;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    protected Button b1, b2, b3, b4, b5, b6, b7, b8,b9,b10, b11,b12;
    protected EditText e1, e2, e3;
    protected float solve=0;
    protected int solve2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editTextX);
        e2 = (EditText) findViewById(R.id.editTextY);
        e3 = (EditText) findViewById(R.id.editTextResult);

        b1 = (Button) findViewById(R.id.AddButton);
        b2 = (Button) findViewById(R.id.MinusButton);
        b3 = (Button) findViewById(R.id.MulButton);
        b4 = (Button) findViewById(R.id.DevButton);
        b5 = (Button) findViewById(R.id.ToBinary);
        b6 = (Button) findViewById(R.id.toHEX);
        b7 = (Button) findViewById(R.id.MOD);
        b8 = (Button) findViewById(R.id.XOR);
        b9 = (Button) findViewById(R.id.Clear);
        b10 = (Button) findViewById(R.id.ResToX);
        b11 = (Button) findViewById(R.id.SignX);
        b12 = (Button) findViewById(R.id.SignY);

        b1.setOnClickListener(Addition);
        b2.setOnClickListener(Substraction);
        b3.setOnClickListener(Multiplication);
        b4.setOnClickListener(Division);
        b5.setOnClickListener(TransformToBIN);
        b6.setOnClickListener(TransformToHEX);
        b7.setOnClickListener(LOpMOD);
        b8.setOnClickListener(LOpXOR);
        b9.setOnClickListener(Cleaning);
        b10.setOnClickListener(ResTox);
        b11.setOnClickListener(SignX);
        b12.setOnClickListener(SignY);
    }
    public View.OnClickListener Addition = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = Float.parseFloat(e1.getText().toString()) + Float.parseFloat(e2.getText().toString());
                e3.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener Substraction = new View.OnClickListener() {
        public void onClick(View v) {
            try{
                solve=Float.parseFloat(e1.getText().toString())-Float.parseFloat(e2.getText().toString());
                e3.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener Multiplication = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = Float.parseFloat(e1.getText().toString()) * Float.parseFloat(e2.getText().toString());
                e3.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener Division = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = Float.parseFloat(e1.getText().toString()) / Float.parseFloat(e2.getText().toString());
                e3.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener TransformToBIN = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve2 = Integer.parseInt(e1.getText().toString());
                e3.setText(Integer.toBinaryString(solve2));
            }catch (IllegalArgumentException e){
                e3.setText("Переполнение типа int");
            }
        }
    };
    public View.OnClickListener TransformToHEX = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = Float.parseFloat(e1.getText().toString());
                e3.setText(Float.toHexString(solve));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener LOpMOD = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve2 = Integer.parseInt(e1.getText().toString()) % Integer.parseInt(e2.getText().toString());
                e3.setText(Integer.toString(solve2));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener LOpXOR = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve2 = Integer.parseInt(e1.getText().toString()) ^ Integer.parseInt(e2.getText().toString());
                e3.setText(Integer.toString(solve2));
            }catch (IllegalArgumentException e){}
        }
    };
    public View.OnClickListener Cleaning = new View.OnClickListener() {
        public void onClick(View v) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
        }
    };
    public View.OnClickListener ResTox = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                Float.parseFloat(e3.getText().toString());
                e1.setText(e3.getText().toString());
            }catch (NumberFormatException e){}
        }
    };
    public View.OnClickListener SignX = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = -Float.parseFloat(e1.getText().toString());
                e1.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}

        }
    };
    public View.OnClickListener SignY = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                solve = -Float.parseFloat(e2.getText().toString());
                e2.setText(Float.toString(solve));
            }catch (IllegalArgumentException e){}
        }
    };

}
