package com.example.tngp17_001.worktn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvSign;
    TextView tvNumber;
    Button btnOne;
    Button btnThree;
    Button btnFive;
    Button btnSeven;
    Button btnNine;
    Button btnEleven;
    Button btnPlus;
    Button btnMinus;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculate");
        initInstance();
    }

    private void initInstance() {
        tvSign = (TextView) findViewById(R.id.tvSignMath);
        tvNumber = (TextView) findViewById(R.id.tvNumber);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnEleven = (Button) findViewById(R.id.btnEleven);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnOne.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnEleven.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnClear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view == btnOne) {
            calculate(1);
        } else if (view == btnThree) {
            calculate(3);
        } else if (view == btnFive) {
            calculate(5);
        } else if (view == btnSeven) {
            calculate(7);
        } else if (view == btnNine) {
            calculate(9);
        } else if (view == btnEleven) {
            calculate(11);
        } else if (view == btnPlus) {
            tvSign.setText("+");
        } else if (view == btnMinus) {
            tvSign.setText("-");
        } else if (view == btnClear) {
            tvSign.setText("");
            tvNumber.setText("");
        }


    }


    private void calculate(int number) {
        int getTvNumberInt = 0;
        int result;
        if (tvSign.getText() != "") {
            try {
                getTvNumberInt = Integer.parseInt(tvNumber.getText().toString());
            } catch (NumberFormatException ex) { // handle your exception

            }

            if (tvSign.getText().toString() == "+") {
                result = getTvNumberInt + number;

            } else {
                result = getTvNumberInt - number;
                if (result < 0) {
                    result=0;
                }
            }
            tvNumber.setText(String.valueOf(result));
        }
        

    }
}
