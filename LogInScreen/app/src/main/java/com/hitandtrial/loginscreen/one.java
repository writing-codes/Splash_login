package com.hitandtrial.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class one extends AppCompatActivity {

    private TextView t1,t2;
    private EditText e1,e2;
    private Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        t1=(TextView)findViewById(R.id.t1);
        e1=(EditText)findViewById(R.id.e1);
        t2=(TextView)findViewById(R.id.t2);
        e2=(EditText)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(one.this,Register.class);
                startActivity(i);
            }
        });
    }
}
