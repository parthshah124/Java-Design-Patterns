package info.parthshah.examples;

import info.parthshah.examples.abstractfactory.CardType;
import info.parthshah.examples.abstractfactory.CreditCard;
import info.parthshah.examples.abstractfactory.CreditCardFactory;
import info.parthshah.examples.adapter.AdapterDemo;
import info.parthshah.examples.bridge.BridgeDemo;
import info.parthshah.examples.builder.PizzaOrder;
import info.parthshah.examples.composite.CompositeMenuDemo;
import info.parthshah.examples.decorator.DecoratorDemo;
import info.parthshah.examples.factory.Website;
import info.parthshah.examples.factory.WebsiteFactory;
import info.parthshah.examples.factory.WebsiteType;
import info.parthshah.examples.flyweight.FlyweightDemo;
import info.parthshah.examples.prototype.Registry;
import info.parthshah.examples.proxy.ProxyDemo;
import info.parthshah.examples.singleton.DbSingleton;

import java.util.Scanner;

public class Demos {
    public static void main(String args[]){
        System.out.println("What do you want to test? (type the index and press enter)");
        System.out.print("1. Singleton Pattern ");
        System.out.print("2. Builder Pattern ");
        System.out.print("3. Prototype Pattern ");
        System.out.print("4. Factory Pattern ");
        System.out.print("5. Abstract Factory Pattern \n");
        System.out.print("6. Adapter Pattern ");
        System.out.print("7. Bridge Pattern ");
        System.out.print("8. Composite Pattern ");
        System.out.print("9. Decorator Pattern ");
        System.out.print("10. Facade Pattern ");
        System.out.print("11. Flyweight Pattern ");
        System.out.print("12. Proxy Pattern \n");

        Scanner input = new Scanner( System.in );
        int index = input.nextInt();

        switch (index) {
            case 1:
                singletonDemo();
                break;
            case 2:
                builderDemo();
                break;
            case 3:
                prototypeDemo();
                break;
            case 4:
                factoryDemo();
                break;
            case 5:
                abstractFactoryDemo();
                break;
            case 6:
                adapterDemo();
                break;
            case 7:
                bridgeDemo();
                break;
            case 8:
                compositeDemo();
                break;
            case 9:
                decoratorDemo();
                break;
            case 10:
                facadeDemo();
                break;
            case 11:
                flyweightDemo();
                break;
            case 12:
                proxyDemo();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static void proxyDemo() {
        ProxyDemo.main(null);
    }

    private static void flyweightDemo() {
        FlyweightDemo.main(null);
    }

    private static void facadeDemo() {
    }

    private static void decoratorDemo() {
        DecoratorDemo.main(null);
    }

    private static void compositeDemo() {
        CompositeMenuDemo.main(null);
    }

    private static void bridgeDemo() {
        BridgeDemo.main(null);
    }

    private static void adapterDemo() {
        AdapterDemo.main(null);
    }

    private static void singletonDemo(){
        long timeBefore, timeAfter;

        timeBefore = System.currentTimeMillis();
        DbSingleton instance = DbSingleton.getInstance();
        timeAfter = System.currentTimeMillis();
        System.out.println("Time to get instance: " + (timeAfter - timeBefore));

        timeBefore = System.currentTimeMillis();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        timeAfter = System.currentTimeMillis();
        System.out.println("Time to get another instance: " + (timeAfter - timeBefore));

        System.out.println("Are they same? " + (instance == anotherInstance));
    }

    private static void builderDemo() {
        PizzaOrder.Builder builder = new PizzaOrder.Builder();
        builder.base("wholewheat").sauce("marinara").topping("jalapenos").cheese("pepperjack");
        PizzaOrder myPizza = builder.build();
        System.out.println(myPizza);
    }

    private static void prototypeDemo() {
        Registry registry = new Registry();

        // They are different objects
        System.out.println(registry.createMovie("romantic"));
        System.out.println(registry.createMovie("romantic"));

        // They are clones
        System.out.println(registry.createMovie("action"));
        System.out.println(registry.createMovie("action"));
    }

    private static void factoryDemo() {
        Website blogSite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        Website shopSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(blogSite.getPages());
        System.out.println(shopSite.getPages());
    }

    private static void abstractFactoryDemo() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());
        System.out.println(abstractFactory.getValidator(CardType.PLATINUM).isValid(card));

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        card = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card.getClass());
        System.out.println(abstractFactory.getValidator(CardType.PLATINUM).isValid(card));
    }
}
