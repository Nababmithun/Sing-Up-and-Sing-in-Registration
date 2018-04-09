package com.androidlime.home_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin;
    TextView signup;

    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signin = (Button) findViewById(R.id.signin_btn);
        signup = (TextView) findViewById(R.id.signup_xml);

        email = (EditText) findViewById(R.id.email_xml);
        password = (EditText) findViewById(R.id.password_xml);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Sign In Successfully", Toast.LENGTH_LONG).show();

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });

    }
}