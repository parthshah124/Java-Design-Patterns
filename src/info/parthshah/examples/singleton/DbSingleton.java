package info.parthshah.examples.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class) { // not making getInstance synchronized, just instance creation
                if (instance == null) instance = new DbSingleton(); // Lazy load
            }
        }

        return instance;
    }
}
