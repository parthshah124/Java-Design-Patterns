package info.parthshah.examples.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return screenName + "'s Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
