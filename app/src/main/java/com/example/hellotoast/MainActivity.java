package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button textZero, textCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        textZero = findViewById(R.id.button_zero);
        textCount = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

        if (mCount % 2 == 0) {
            textCount.setBackgroundColor(getResources().getColor(R.color.colorPar));
        } else {
            textCount.setBackgroundColor(getResources().getColor(R.color.colorImpar));
        }
    }

    public void textZero(View view) {
        textZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mShowCount != null) {
                    mCount = 0;
                    mShowCount.setText(Integer.toString(0));
                    textCount.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
    }
}
