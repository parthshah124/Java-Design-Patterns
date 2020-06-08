package info.parthshah.examples.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
