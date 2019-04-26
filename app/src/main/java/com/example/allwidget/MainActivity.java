package com.example.allwidget;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextInputLayout til;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        til = findViewById(R.id.email_layout);
//        int sw = getResources().getConfiguration().smallestScreenWidthDp;
        TextView tv = findViewById(R.id.tv);
       // tv.setText(""+sw);

    }

    public void clickHere(View view) {
        Toast.makeText(this, ""+til.getEditText().getText().toString(), Toast.LENGTH_SHORT).show();

    }
}
