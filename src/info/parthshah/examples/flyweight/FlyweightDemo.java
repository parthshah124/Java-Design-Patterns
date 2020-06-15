package info.parthshah.examples.flyweight;

public class FlyweightDemo {
    public static void main(String[] args){
        InventorySystem phoneInventorySystem = new InventorySystem();

        phoneInventorySystem.takeOrder("iphone 11", 23);
        phoneInventorySystem.takeOrder("galaxy s10", 30);
        phoneInventorySystem.takeOrder("huawei p40", 21);
        phoneInventorySystem.takeOrder("xperia x1", 232);
        phoneInventorySystem.takeOrder("galaxy s20", 223);
        phoneInventorySystem.takeOrder("galaxy s20", 123);
        phoneInventorySystem.takeOrder("galaxy s20", 233);
        phoneInventorySystem.takeOrder("iphone 11", 230);
        phoneInventorySystem.takeOrder("iphone 11", 243);
        phoneInventorySystem.takeOrder("iphone 11", 253);
        phoneInventorySystem.takeOrder("iphone 11", 234);
        phoneInventorySystem.takeOrder("iphone 11 pro", 213);
        phoneInventorySystem.takeOrder("iphone 11", 239);
        phoneInventorySystem.takeOrder("galaxy s20", 283);
        phoneInventorySystem.takeOrder("iphone 11", 293);

        phoneInventorySystem.process();

        System.out.println("\n" + phoneInventorySystem.report());
    }
}
