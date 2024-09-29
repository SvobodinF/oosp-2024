package patterns.adapter;

import patterns.adapter.interfaces.SocialAPIAdapter;
import patterns.adapter.models.adapters.FacebookAdapter;
import patterns.adapter.models.adapters.InstagramAdapter;
import patterns.adapter.models.adapters.TwitterAdapter;
import patterns.adapter.models.api.FacebookAPI;
import patterns.adapter.models.api.InstagramAPI;
import patterns.adapter.models.api.TwitterAPI;

import java.util.ArrayList;
import java.util.List;

public class Entrypoint {
    public static void main(String[] args) {
        List<SocialAPIAdapter> adapters = new ArrayList<SocialAPIAdapter>();

        adapters.add(new FacebookAdapter(new FacebookAPI()));
        adapters.add(new InstagramAdapter(new InstagramAPI()));
        adapters.add(new TwitterAdapter(new TwitterAPI()));

        for (SocialAPIAdapter adapter: adapters) {
            adapter.sendMessage("Test message");
        }
    }
}
