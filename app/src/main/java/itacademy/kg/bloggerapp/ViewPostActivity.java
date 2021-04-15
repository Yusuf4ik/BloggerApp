package itacademy.kg.bloggerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ViewPostActivity extends AppCompatActivity  {
    BloggerAdapter adapter;
    ListView listView;
    TextView helloUser;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);
        helloUser = (TextView) findViewById(R.id.helloUser);
        cardView = (CardView) findViewById(R.id.cardView);

        for (userInfo us: ListDB.getUserList()) {
            helloUser.setText("Hello " +us.getUserName());
        }
        listView = (ListView) findViewById(R.id.listView);
        adapter = new BloggerAdapter(ViewPostActivity.this,
                R.layout.list_item, Post.post_list);
        listView.setAdapter(adapter);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==cardView.getId()){
                    startActivity(new Intent(ViewPostActivity.this, ViewDescriptionsOfPost.class));
                }
            }
        });
    }

}