package itacademy.kg.bloggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView userNamee, userPass, userEmail, userConfirmPass, startLogIn;
    Button registerUser;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNamee = (TextView) findViewById(R.id.nickName);
        userPass = (TextView) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        startLogIn = (TextView) findViewById(R.id.startLogInActivity);
        registerUser = (Button) findViewById(R.id.register);
        userConfirmPass = (TextView) findViewById(R.id.corfirmPassword);
        userEmail = (TextView) findViewById(R.id.email);


        registerUser.setOnClickListener(this);
        startLogIn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register:
                ListDB.userList.add(new userInfo(userNamee.getText().toString(), userEmail.getText().toString(),
                        userPass.getText().toString(), userConfirmPass.getText().toString()));
                registering();
                break;
            case R.id.startLogInActivity:
                startActivity(new Intent(MainActivity.this, LogInActivity.class));
                break;
        }
        progressBar.setVisibility(View.VISIBLE);


    }

    protected void registering() {
        if (!TextUtils.isEmpty(userNamee.getText())&&!TextUtils.isEmpty(userPass.getText())
                &&!TextUtils.isEmpty(userEmail.getText())&&!TextUtils.isEmpty(userConfirmPass.getText())) {
            if(userConfirmPass.getText().toString().equals(userPass.getText().toString())){
                startActivity(new Intent(MainActivity.this, LogInActivity.class));

            }
        } else if (TextUtils.isEmpty(userNamee.getText())&&TextUtils.isEmpty(userPass.getText())
                &&TextUtils.isEmpty(userEmail.getText())&&TextUtils.isEmpty(userConfirmPass.getText())) {
                Toast.makeText(MainActivity.this, "Fill in the blanks and if they're filled, confirm your password correctly", Toast.LENGTH_SHORT).show();

            }

        }

    }
