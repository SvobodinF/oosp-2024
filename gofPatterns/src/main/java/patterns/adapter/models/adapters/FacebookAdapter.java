package patterns.adapter.models.adapters;

import patterns.adapter.interfaces.SocialAPIAdapter;
import patterns.adapter.models.api.FacebookAPI;

public class FacebookAdapter implements SocialAPIAdapter {
    private final FacebookAPI facebookAPI;

    public FacebookAdapter(FacebookAPI facebookAPI) {
        this.facebookAPI = facebookAPI;
    }

    public void sendMessage(String message) {
        facebookAPI.createPost(message);
    }
}
