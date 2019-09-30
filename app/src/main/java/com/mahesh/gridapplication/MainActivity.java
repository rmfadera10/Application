package com.mahesh.gridapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mahesh.gridapplication.arithmetic.Arithmetic;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnzero, btnadd, btnsub, btndivide, btnpercent, btnequal, btnmultiply, btnclear, btnclearhistory, btnback, btndot;
    private EditText editview;
    private Double var1, var2, result;
    private Boolean add, sub, divide, percent, multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        add=false;
        sub=false;
        divide=false;
        percent=false;
        multiply=false;
//        Binding Reference to the variable
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnzero = findViewById(R.id.btnzero);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btndivide = findViewById(R.id.btndivide);
        btnpercent = findViewById(R.id.btnpercent);
        btnequal = findViewById(R.id.btnequal);
        btnmultiply = findViewById(R.id.btnmultiply);
        btnclear = findViewById(R.id.btnclear);
        editview = findViewById(R.id.editview);
        btnclearhistory = findViewById(R.id.btnclearhistory);
        btnback = findViewById(R.id.btnback);
        btndot = findViewById(R.id.btndot);

//        Adding Click listener on Button
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnzero.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnpercent.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnclearhistory.setOnClickListener(this);
        btnback.setOnClickListener(this);
        btndot.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            editview.setText(editview.getText() + "1");
        } else if (view.getId() == R.id.btn2) {
            editview.setText(editview.getText() + "2");
        } else if (view.getId() == R.id.btn3) {
            editview.setText(editview.getText() + "3");
        } else if (view.getId() == R.id.btn4) {
            editview.setText(editview.getText() + "4");
        } else if (view.getId() == R.id.btn5) {
            editview.setText(editview.getText() + "5");
        } else if (view.getId() == R.id.btn6) {
            editview.setText(editview.getText() + "6");
        } else if (view.getId() == R.id.btn7) {
            editview.setText(editview.getText() + "7");
        } else if (view.getId() == R.id.btn8) {
            editview.setText(editview.getText() + "8");
        } else if (view.getId() == R.id.btn9) {
            editview.setText(editview.getText() + "9");
        } else if (view.getId() == R.id.btnzero) {
            editview.setText(editview.getText() + "0");
        } else if (view.getId() == R.id.btndot) {
            editview.setText(editview.getText() + ".");
        } else if (view.getId() == R.id.btnadd) {
            var1 = Double.parseDouble(editview.getText() + "");
            add = true;
            editview.setText(null);
        } else if (view.getId() == R.id.btnsub) {
            var1 = Double.parseDouble(editview.getText() + "");
            sub = true;
            editview.setText(null);
        } else if (view.getId() == R.id.btndivide) {
            var1 = Double.parseDouble(editview.getText() + "");
            divide = true;
            editview.setText(null);
        } else if (view.getId() == R.id.btnmultiply) {
            var1 = Double.parseDouble(editview.getText() + "");
            multiply = true;
            editview.setText(null);
        } else if (view.getId() == R.id.btnpercent) {
            var1 = Double.parseDouble(editview.getText() + "");
            percent = true;
            editview.setText(null);
        } else if (view.getId() == R.id.btnequal) {
            var2 = Double.parseDouble(editview.getText() + "");
            if (add == true) {
                Arithmetic arithmetic = new Arithmetic();
                arithmetic.setVar1(var1);
                arithmetic.setVar2(var2);
                result = arithmetic.addiction();
                editview.setText(result + "");
                add = false;
            } else if (sub == true) {

                Arithmetic arithmetic = new Arithmetic();
                arithmetic.setVar1(var1);
                arithmetic.setVar2(var2);
                result = arithmetic.subtraction();
                editview.setText(result + "");
                add = false;
            } else if (divide == true) {
                Arithmetic arithmetic = new Arithmetic();
                arithmetic.setVar1(var1);
                arithmetic.setVar2(var2);
                result = arithmetic.divide();
                editview.setText(result + "");
                add = false;
            } else if (multiply == true) {
                Arithmetic arithmetic = new Arithmetic();
                arithmetic.setVar1(var1);
                arithmetic.setVar2(var2);
                result = arithmetic.multiplicaton();
                editview.setText(result + "");
                add = false;
            } else if (percent == true) {
                Arithmetic arithmetic = new Arithmetic();
                arithmetic.setVar1(var1);
                arithmetic.setVar2(var2);
                result = arithmetic.remainder();
                editview.setText(result + "");
                add = false;
            }
        } else if (view.getId() == R.id.btnback) {
            String str = editview.getText().toString();
            if (str.length() > 1) {
                str = str.substring(0, str.length() - 1);
                editview.setText(str);
            } else if (str.length() <= 1) {
                editview.setText("0");
            }
        } else if (view.getId() == R.id.btnclear) {
            editview.setText(null);
        } else if (view.getId() == R.id.btnclearhistory) {
            editview.setText(null);
        }
    }
}
