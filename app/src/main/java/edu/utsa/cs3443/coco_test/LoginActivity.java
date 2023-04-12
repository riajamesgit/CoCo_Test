package edu.utsa.cs3443.coco_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin are correct username and password

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correct
                    //Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    //Button button = findViewById(R.id.loginbtn);
                    //button.setOnClickListener(new View.OnClickListener() {
                       // @Override
                        //public void onClick(View v) {
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                      //  }
                   // });
                }
                else {
                    //incorrect
                    Toast.makeText(LoginActivity.this, "Incorrect username or password.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}