package com.example.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edt1,edt2;

    Button btn;
    String un , pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);

        btn = findViewById(R.id.sub);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {








                un = edt1.getText().toString();
                pass = edt2.getText().toString();
                 Bundle bundle = new Bundle();

                 bundle.putString("un",un);
                 bundle.putString("pass",pass);

                Intent i = new Intent(MainActivity.this,Main2Activity.class);

                i.putExtras(bundle);

                startActivity(i);

            }
        });
    }
}
