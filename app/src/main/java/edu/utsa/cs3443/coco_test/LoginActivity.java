package edu.utsa.cs3443.coco_test;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.coco_test.model.University;
import edu.utsa.cs3443.coco_test.model.User;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    static ArrayList<String> userNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin are correct username and password
        /**
         * TODOS:
         * - Create a function that checks to see if a existing username and corresponding password match the users input
         *      - Do we have to create a class that runs the functions so that we can call them? Im not sure how fragments work
         *      -- Zach lol
         */
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = getApplicationContext();
                University Uni = new University("UTSA");

                Uni.importUsers("accounts.csv", c);
                userNameList = Uni.getUserNameList("accounts.csv", c);
                Uni.importPosts("posts.csv", c);
                User user = Uni.getMap().get(username.getText().toString());
                if (Uni.getMap().containsKey(username.getText().toString()) && password.getText().toString().equals(user.getPassWord())) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Incorrect username or password.", Toast.LENGTH_LONG).show();
                }
            }
        });

        Button registerbtn = findViewById(R.id.registerbtn);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}