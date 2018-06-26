 package com.example.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

 public class MainActivity extends AppCompatActivity {

     private Button btnone;
     private Button btntwo;
     private Button btnthree;
     private Button btnfour;
     private Button btnfive;
     private Button btnsix;
     private Button btnseven;
     private Button btneight;
     private Button btnnine;
     private Button btnzero;
     private Button btneql;
     private Button btnclear;
     private Button btnadd;
     private Button btnmul;
     private Button btndiv;
     private Button btnsub;
     private TextView info;
     private TextView result;
     private final char ADDITION = '+';
     private final char SUBSTRACTION = '-';
     private final char DIVISION = '/';
     private final char MULTIPLICATION = '*';
     private final char EQU = '0';
     private double val1 = Double.NaN;
     private double val2;
     private char ACTION;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         setupUIView();
         btnzero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "0");
             }
         });

         btnone.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "1");
             }
         });

         btntwo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "2");
             }
         });

         btnthree.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "3");
             }
         });

         btnfour.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "4");
             }
         });

         btnfive.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "5");
             }
         });

         btnsix.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "6");
             }
         });

         btnseven.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "7");
             }
         });

         btneight.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "8");
             }
         });

         btnnine.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 info.setText(info.getText().toString() + "9");
             }
         });
         btnadd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 compute();
                 ACTION=ADDITION;
                 result.setText(String.valueOf(val1) + "+");
                 info.setText(null);

             }
         });

         btnmul.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 compute();
                 ACTION=MULTIPLICATION;
                 result.setText(String.valueOf(val1) + "*");
                 info.setText(null);

             }
         });
         btnsub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 compute();
                 ACTION=SUBSTRACTION;
                 result.setText(String.valueOf(val1) + "-");
                 info.setText(null);

             }
         });

         btndiv.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 compute();
                 ACTION=DIVISION;
                 result.setText(String.valueOf(val1) + "/");
                 info.setText(null);

             }
         });
         btneql.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 compute();
                 ACTION=EQU ;
                 result.setText(result.getText().toString() +  String.valueOf(val2) + "=" + String.valueOf(val1));
                 info.setText(null);

             }
         });

         btnclear.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(info.getText().length()>0){

                     CharSequence name = info.getText().toString();
                     info.setText(name.subSequence(0,name.length()-1));
                 }
                 else {

                     val1 = Double.NaN;
                     val2 = Double.NaN;
                     info.setText(null);
                     result.setText(null);
                 }
             }
         });
     }

     private void setupUIView() {

         btnone = (Button) findViewById(R.id.one);
         btntwo = (Button) findViewById(R.id.two);
         btnthree = (Button) findViewById(R.id.three);
         btnfour = (Button) findViewById(R.id.four);
         btnfive = (Button) findViewById(R.id.five);
         btnsix = (Button) findViewById(R.id.six);
         btnseven = (Button) findViewById(R.id.seven);
         btneight = (Button) findViewById(R.id.eight);
         btnnine = (Button) findViewById(R.id.nine);
         btnzero = (Button) findViewById(R.id.zero);
         btneql = (Button) findViewById(R.id.eql);
         btnclear = (Button) findViewById(R.id.clear);
         btnadd = (Button) findViewById(R.id.add);
         btndiv = (Button) findViewById(R.id.div);
         btnmul = (Button) findViewById(R.id.mul);
         btnsub = (Button) findViewById(R.id.sub);
         info = (TextView) findViewById(R.id.txt1);
         result = (TextView) findViewById(R.id.result);
     }

     private void compute() {
         if (!Double.isNaN(val1)) {

             val2 = Double.parseDouble(info.getText().toString());

             switch (ACTION) {

                 case ADDITION:
                     val1 = val1 + val2;
                     break;
                 case SUBSTRACTION:
                     val1 = val1 - val2;
                     break;
                 case MULTIPLICATION:
                     val1 = val1 * val2;
                     break;
                 case DIVISION:
                     val1 = val1 / val2;
                     break;
                 case EQU:
                     break;
             }
         }
         else{

             val1 = Double.parseDouble(info.getText().toString());
         }
     }
 }
