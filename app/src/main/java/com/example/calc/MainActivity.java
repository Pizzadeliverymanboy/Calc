package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private final ArrayList<String>  op = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = findViewById(R.id.btn_zero);
        Button b1 = findViewById(R.id.btn_one);
        Button b2 = findViewById(R.id.btn_two);
        Button b3 = findViewById(R.id.btn_three);
        Button b4 = findViewById(R.id.btn_four);
        Button b5 = findViewById(R.id.btn_five);
        Button b6 = findViewById(R.id.btn_six);
        Button b7 = findViewById(R.id.btn_seven);
        Button b8 = findViewById(R.id.btn_eight);
        Button b9 = findViewById(R.id.btn_nine);
        Button bPlus = findViewById(R.id.btn_plus);
        Button bMinus = findViewById(R.id.btn_minus);
        Button bMul = findViewById(R.id.btn_multiple);
        Button bDiv = findViewById(R.id.btn_divide);
        Button bPercentage = findViewById(R.id.btn_percentage);
        Button bDelete = findViewById(R.id.btn_delete);
        Button bDot = findViewById(R.id.btn_dot);
        Button bBracket = findViewById(R.id.btn_small_bracket);
        Button bBack = findViewById(R.id.btn_back);
        Button bEqual = findViewById(R.id.btn_equal);




        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                tv.setText(tv.getText() + input);
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                String lastInput = "";
                if(tv.getText().length() != 0){
                    lastInput = String.valueOf(tv.getText().charAt(tv.getText().length() - 1));
                }
                if(tv.getText().length() == 0){
                    tv.setText("0+");
                }
                else if(lastInput.matches("[-X/]")){
                    tv.setText(tv.getText().subSequence(0, tv.getText().length() - 1) + "+");
                }
                else if(lastInput.equals("+")){
                }
                else{
                    tv.setText(tv.getText() + input);
                }
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                String lastInput = "";
                if(tv.getText().length() != 0){
                    lastInput = String.valueOf(tv.getText().charAt(tv.getText().length() - 1));
                }
                if(tv.getText().length() == 0){
                    tv.setText("0-");
                }
                else if(lastInput.matches("[X+/]")){
                    tv.setText(tv.getText().subSequence(0, tv.getText().length() - 1) + "-");
                }
                else if(lastInput.equals("-")){
                }
                else{
                    tv.setText(tv.getText() + input);
                }
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                String lastInput = "";
                if(tv.getText().length() != 0) {
                    lastInput = String.valueOf(tv.getText().charAt(tv.getText().length() - 1));
                }
                if(tv.getText().length() == 0){
                    tv.setText("0X");
                }
                else if(lastInput.matches("[-/+]")){
                    tv.setText(tv.getText().subSequence(0, tv.getText().length() - 1) + "/");
                }
                else if(lastInput.equals("/")){
                }
                else{
                    tv.setText(tv.getText() + input);
                }

            }

        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                String input = ((Button) v).getText().toString();
                String lastInput = "";
                if(tv.getText().length() != 0){
                    lastInput = String.valueOf(tv.getText().charAt(tv.getText().length() - 1));
                }
                if(tv.getText().length() == 0){
                    tv.setText("0/");
                }
                else if(lastInput.matches("[-X+]")){
                    tv.setText(tv.getText().subSequence(0, tv.getText().length() - 1) + "/");
                }
                else if(lastInput.equals("/")){
                }
                else{
                    tv.setText(tv.getText() + input);
                }
            }
        });

        bPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);

            }
        });

        bDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv1 = findViewById(R.id.input);
                TextView tv2 = findViewById(R.id.result);
                tv1.setText("");
                tv2.setText("0");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                if(tv.getText().length() == 0 || tv.getText().subSequence(tv.getText().length()- 1, tv.getText().length()).){
                    tv.setText(tv.getText() + "0.");
                }
                else if
            }
        });

        bBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.input);
                tv.setText(tv.getText().subSequence(0, tv.getText().length() - 1));
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv1 = findViewById(R.id.input);
                TextView tv2 = findViewById(R.id.result);
                StringBuilder result = new StringBuilder(tv1.getText().length());
                result.append(tv1.getText());
                String resultstr = String.valueOf(calc3.eingabe(result.toString()));
                tv2.setText(resultstr);
            }
        });




        /*b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bPercentage.setOnClickListener(this);
        bDelete.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bBracket.setOnClickListener(this);
        bBack.setOnClickListener(this);
        bEqual.setOnClickListener(this);
        b0.setOnClickListener(this);




    }


    @Override
    public void onClick(View v){
        TextView tv1 = findViewById(R.id.input);
        TextView tv2 = findViewById(R.id.result);
        String input = ((Button)v).getText().toString();
        if(input.equals("=")){
            StringBuilder result = new StringBuilder(tv1.getText().length());
            result.append(tv1.getText());
            String resultstr = String.valueOf(calc3.eingabe(result.toString()));
            tv2.setText(resultstr);
            tv1.setText(tv1.getText() + input);
        }
        else{
            tv1.setText(tv1.getText() + input);
        }
    }*/
    }
}