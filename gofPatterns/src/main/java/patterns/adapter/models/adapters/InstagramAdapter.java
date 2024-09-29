package patterns.adapter.models.adapters;

import patterns.adapter.interfaces.SocialAPIAdapter;
import patterns.adapter.models.api.InstagramAPI;

public class InstagramAdapter implements SocialAPIAdapter {
    private final InstagramAPI instagramAPI;

    public InstagramAdapter(InstagramAPI instagramAPI) {
        this.instagramAPI = instagramAPI;
    }

    public void sendMessage(String message) {
        instagramAPI.publishPhoto(message);
    }
}
