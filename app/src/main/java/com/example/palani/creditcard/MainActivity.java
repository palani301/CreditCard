package com.example.palani.creditcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6;
    EditText editText1, editText2, editText3, editText4, editText5, editText6;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);

        editText1 = (EditText) findViewById(R.id.editText);
        editText1.setBackgroundResource(R.drawable.focus_border_style);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setBackgroundResource(R.drawable.focus_border_style);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText3.setBackgroundResource(R.drawable.focus_border_style);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText4.setBackgroundResource(R.drawable.focus_border_style);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText5.setBackgroundResource(R.drawable.focus_border_style);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText6.setBackgroundResource(R.drawable.focus_border_style);

        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Submited Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cancelled",Toast.LENGTH_SHORT).show();

            }
        });

    }

}