package com.example.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String un , pass;
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1 = findViewById(R.id.text);
        txt2 = findViewById(R.id.text2);
        Bundle bundle = getIntent().getExtras();


        un = bundle.getString("un");
        pass = bundle.getString("pass");


        txt1.setText(un);
        txt2.setText(pass);

    }
}
