package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_dot, b_sum, b_sub, b_div,
            b_mul, b_clear, b_eq, b_sign, b_root, b_back;
    EditText input;
    float mValueOne, mValueTwo;
    boolean sum, sub, mul, div;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_back = (Button) findViewById(R.id.button1);
        b_clear = (Button) findViewById(R.id.button2);
        b_sign = (Button) findViewById(R.id.button3);
        b_root = (Button) findViewById(R.id.button4);
        b7 = (Button) findViewById(R.id.button5);
        b8 = (Button) findViewById(R.id.button6);
        b9 = (Button) findViewById(R.id.button7);
        b_div = (Button) findViewById(R.id.button8);
        b4 = (Button) findViewById(R.id.button9);
        b5 = (Button) findViewById(R.id.button10);
        b6 = (Button) findViewById(R.id.button11);
        b_mul = (Button) findViewById(R.id.button12);
        b1 = (Button) findViewById(R.id.button13);
        b2 = (Button) findViewById(R.id.button14);
        b3 = (Button) findViewById(R.id.button15);
        b_sub = (Button) findViewById(R.id.button16);
        b0 = (Button) findViewById(R.id.button17);
        b_dot = (Button) findViewById(R.id.button18);
        b_sum = (Button) findViewById(R.id.button19);
        b_eq = (Button) findViewById(R.id.button20);
        input= (EditText) findViewById(R.id.output);

        b_clear.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            if (!TextUtils.isEmpty(inputted)) {
                input.setText("");
            }
        });
        b_back.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            if (!TextUtils.isEmpty(inputted)) {
                input.setText(inputted.substring(0, inputted.length() - 1));
            }
        });

        b7.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("7"));
        });
        b8.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("8"));
        });
        b9.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("9"));
        });
        b4.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("4"));
        });
        b5.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("5"));
        });
        b6.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("6"));
        });
        b1.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("1"));
        });
        b2.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("2"));
        });
        b3.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("3"));
        });
        b0.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("0"));
        });
        b_dot.setOnClickListener(v -> {
            String inputted = input.getText().toString();
            input.setText(inputted.concat("."));
        });

        b_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("") && !input.getText().toString().contains("-")){
                    mValueOne = Float.parseFloat(input.getText() + "");
                    sum = true;
                    if(Math.sqrt(mValueOne) % 1 == 0){
                        input.setText(Math.round(Math.sqrt(mValueOne)) + "");
                    }
                    else{
                        input.setText(Math.sqrt(mValueOne) + "");
                    }
                }
            }
        });
        b_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    mValueOne = Float.parseFloat(input.getText() + "");
                    sum = true;
                    input.setText(null);
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    mValueOne = Float.parseFloat(input.getText() + "");
                    sub = true;
                    input.setText(null);
                }
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    mValueOne = Float.parseFloat(input.getText() + "");
                    mul = true;
                    input.setText(null);
                }
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    mValueOne = Float.parseFloat(input.getText() + "");
                    div = true;
                    input.setText(null);
                }
            }
        });
        b_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    if (input.getText().toString().contains("-")) {
                        StringBuilder inp = new StringBuilder(input.getText().toString());
                        inp.setCharAt(0, ' ');
                        input.setText(inp);
                    }
                    else if (input.getText().toString().charAt(0) == ' ') {
                        StringBuilder inp = new StringBuilder(input.getText().toString());
                        inp.setCharAt(0, '-');
                        input.setText(inp);
                    }

                    else {
                        input.setText("-" + input.getText());
                    }
                }
            }
        });
        b_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input != null && !input.getText().toString().equals("")) {
                    Float result = (float) 0;
                    mValueTwo = Float.parseFloat(input.getText() + "");
                    if (sum) {
                        result = mValueOne + mValueTwo;
                        sum = false;
                    } else if (sub) {
                        result = mValueOne - mValueTwo;
                        sub = false;
                    } else if (mul) {
                        result = mValueOne * mValueTwo;
                        mul = false;
                    } else if (div) {
                        result = mValueOne / mValueTwo;
                        div = false;
                    }
                    if (result % 1 == 0) {
                        input.setText(Math.round(result) + "");
                    } else {
                        input.setText(result + "");
                    }
                }
            }
        });
    }
}