package itacademy.kg.bloggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    TextView goToRegister, email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        button = (Button) findViewById(R.id.signIn);
        goToRegister = (TextView) findViewById(R.id.goToRegister);
        email = (TextView) findViewById(R.id.emailInLoging);
        password = (TextView) findViewById(R.id.passwordInLoging);

        button.setOnClickListener(this);
        goToRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signIn:
                String stEmail = email.getText().toString();
                String stPass = password.getText().toString();
                for (userInfo user:ListDB.getUserList()) {

                    if(user.getEmail().equals(stEmail) && user.getPassword().equals(stPass) && !stEmail.isEmpty() && !stPass.isEmpty()){
                        startActivity(new Intent(LogInActivity.this, AddPostActivity.class));

                    }else{
                        Toast.makeText(LogInActivity.this, "Fill in the blanks", Toast.LENGTH_SHORT).show();

                    }
                }
                break;
            case R.id.goToRegister:
                startActivity(new Intent(LogInActivity.this, MainActivity.class));
                break;
        }
    }
}