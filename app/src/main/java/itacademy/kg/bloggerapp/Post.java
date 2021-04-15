package itacademy.kg.bloggerapp;

import java.util.ArrayList;

public class Post {
    static ArrayList<Post> post_list = new ArrayList<>();
    String post_title;
    String post_description;
    String post_tags;
    String post_auth;

    public Post(String post_title, String post_description, String post_tags, String post_auth) {
        this.post_title = post_title;
        this.post_description = post_description;
        this.post_tags = post_tags;
        this.post_auth = post_auth;
    }

    public String getPost_title() {
        return post_title;
    }

    public String getPost_tags() {
        return post_tags;
    }

    public String getPost_auth() {
        return post_auth;
    }

    public String getPost_description() {
        return post_description;
    }
    public void AddPost(Post post){
        post_list.add(post);
    }

}
