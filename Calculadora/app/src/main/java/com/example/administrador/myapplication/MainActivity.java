package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView res;
    EditText txt1, txt2;
    Button Btn11,Btn12,Btn13,Btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= (EditText)findViewById(R.id.editText);
        txt2= (EditText)findViewById(R.id.editText2);
        res= (TextView)findViewById(R.id.textView);
        Btn11=(Button) findViewById(R.id.button2);
        Btn11=(Button) findViewById(R.id.button3);
        Btn11=(Button) findViewById(R.id.button4);
        Btn12=(Button) findViewById(R.id.button2);
        Btn12=(Button) findViewById(R.id.button3);
        Btn12=(Button) findViewById(R.id.button4);
        Btn13=(Button) findViewById(R.id.button2);
        Btn13=(Button) findViewById(R.id.button3);
        Btn13=(Button) findViewById(R.id.button4);
        Btn14=(Button) findViewById(R.id.button2);
        Btn14=(Button) findViewById(R.id.button3);
        Btn14=(Button) findViewById(R.id.button4);

        Btn11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String n1= txt1.getText().toString();
                String n2= txt2.getText().toString();
                int numer1 = Integer.parseInt(n1);
                int numer2 = Integer.parseInt(n2);
                int resul = numer1+numer2;
                res.setText(String.valueOf(resul));
            }
        });
        Btn12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String n1= txt1.getText().toString();
                String n2= txt2.getText().toString();
                int numer1 = Integer.parseInt(n1);
                int numer2 = Integer.parseInt(n2);
                int resul = numer1-numer2;
                res.setText(String.valueOf(resul));
            }
        });
        Btn13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String n1= txt1.getText().toString();
                String n2= txt2.getText().toString();
                int numer1 = Integer.parseInt(n1);
                int numer2 = Integer.parseInt(n2);
                int resul = numer1*numer2;
                res.setText(String.valueOf(resul));
            }
        });
        Btn14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String n1= txt1.getText().toString();
                String n2= txt2.getText().toString();
                int numer1 = Integer.parseInt(n1);
                int numer2 = Integer.parseInt(n2);
                int resul = numer1/numer2;
                res.setText(String.valueOf(resul));
            }
        });



    }
}
