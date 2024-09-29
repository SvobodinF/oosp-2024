package patterns.adapter.models.api;

public class TwitterAPI {
    public void tweet(String tweetContent) {
        System.out.println("Tweet sent: " + tweetContent);
    }
}
