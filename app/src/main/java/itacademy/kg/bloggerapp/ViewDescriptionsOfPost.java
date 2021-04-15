package itacademy.kg.bloggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class ViewDescriptionsOfPost extends AppCompatActivity {

    String  titles, descriptions, tags, postAuth;
    Date date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        titles = findViewById(R.id.titles).toString();
        descriptions = findViewById(R.id.descriptions).toString();
        tags = findViewById(R.id.tags).toString();
        postAuth = findViewById(R.id.postAuth).toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_descriptions_of_post);
        for (Post post: Post.post_list) {
            titles = post.getPost_title();
            descriptions = post.getPost_description();
            titles = post.getPost_title();
            tags = post.getPost_tags();
            postAuth = post.getPost_auth();
        }
    }
}