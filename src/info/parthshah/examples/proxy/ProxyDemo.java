package info.parthshah.examples.proxy;

public class ProxyDemo {
    public static void main(String args[]){
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("jeffb"));
    }
}
