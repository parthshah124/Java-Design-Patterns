package info.parthshah.examples.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented!");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented!");
    }

    public abstract String toString();

    String print(MenuComponent menuComponent){
        return name + ": " + url + "\n";
    }
}
