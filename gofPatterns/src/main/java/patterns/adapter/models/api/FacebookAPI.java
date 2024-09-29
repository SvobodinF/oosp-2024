package patterns.adapter.models.api;

public class FacebookAPI {
    public void createPost(String content) {
        System.out.println("Facebook post created: " + content);
    }
}
