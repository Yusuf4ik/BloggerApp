package itacademy.kg.bloggerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BloggerAdapter extends ArrayAdapter<Post> implements View.OnClickListener {
    Context context;


    public BloggerAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Post> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String userName;
        Button addPostButton;
        String title;
        String description;
        TextView tv_plot, tv_userTitle;

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.list_item, parent, false);

        title = getItem(position).post_title;
        description = getItem(position).post_description;

        tv_plot = (TextView) convertView.findViewById(R.id.plot);
        tv_userTitle = (TextView) convertView.findViewById(R.id.userTitle);
        addPostButton = convertView.findViewById(R.id.addPostButton);

        tv_plot.setText(description);
        tv_userTitle.setText(title);

        return convertView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addPostButton:
                break;
        }
    }
}
