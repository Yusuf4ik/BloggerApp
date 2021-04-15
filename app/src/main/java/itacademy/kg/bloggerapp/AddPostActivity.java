package itacademy.kg.bloggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class AddPostActivity extends AppCompatActivity {
    TextView postTitle, postDescription, postAuthName, postTags;
    Button addPost;
    Date date2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        postTitle = findViewById(R.id.postTitle);
        postDescription = findViewById(R.id.postDescription);
        postTags = findViewById(R.id.postTags);
        postAuthName = findViewById(R.id.postAuthName);
        addPost = findViewById(R.id.addPostButton);
        addPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.addPostButton:
                        checking();
                }
            }
        });

    }

    public void checking() {
        if (!postTitle.getText().toString().isEmpty() && !postDescription.getText().toString().isEmpty() &&
                !postAuthName.getText().toString().isEmpty() && !postTags.getText().toString().isEmpty()) {
            Post post2 = new Post(postTitle.getText().toString(), postDescription.getText().toString(), postTags.getText().toString(), postAuthName.getText().toString());
            post2.AddPost(post2);
            date2 = new Date();
            startActivity(new Intent(AddPostActivity.this, ViewPostActivity.class));

        } else {
            Toast.makeText(AddPostActivity.this, "Fill in the blanks ", Toast.LENGTH_SHORT).show();
        }

    }

      public  Date getDate2() {
        return date2;
    }
}