package info.parthshah.examples.factory;

public class Blog extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
