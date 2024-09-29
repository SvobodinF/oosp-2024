package patterns.adapter.models.adapters;

import patterns.adapter.interfaces.SocialAPIAdapter;
import patterns.adapter.models.api.TwitterAPI;

public class TwitterAdapter implements SocialAPIAdapter {
    private final TwitterAPI twitterAPI;

    public TwitterAdapter(TwitterAPI twitterAPI) {
        this.twitterAPI = twitterAPI;
    }

    public void sendMessage(String message) {
        twitterAPI.tweet(message);
    }
}
