package com.samsung.lesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;

    int[] IDS = {
            R.id.button0,
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.buttonequal,
            R.id.buttonminus,
            R.id.buttonplus,
            R.id.buttondevide,
            R.id.buttonmultiply,
            R.id.buttonbrackets,
            R.id.buttonplusminus,
            R.id.buttondot
    };

    TextView textView [] = new TextView[IDS.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        for (int i = 0; i < IDS.length; i++) {
            textView[i] = findViewById(IDS[i]);
            textView[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button0:
                text.setText("0");
                break;
        }
    }
}