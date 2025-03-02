
class LazySingleton {
    // The single instance, initially null
    private static LazySingleton instance;
    
    // Private constructor to prevent instantiation
    private LazySingleton() {}
    
    // Public method to get the instance
    public static LazySingleton getInstance() {
        // Check if instance is null
        if (instance == null) {
            // If null, create a new instance
            instance = new LazySingleton();
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}

class ThreadSafeSingleton {
    // The single instance, initially null
    private static ThreadSafeSingleton instance;
    
    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {}
    
    // Public method to get the instance, with synchronized keyword
    public static synchronized ThreadSafeSingleton getInstance() {
        // Check if instance is null
        if (instance == null) {
            // If null, create a new instance
            instance = new ThreadSafeSingleton();
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}


class EagerSingleton {
    // The single instance, created immediately
    private static final EagerSingleton instance = new EagerSingleton();
    
    // Private constructor to prevent instantiation
    private EagerSingleton() {}
    
    // Public method to get the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}


public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        // Add any singleton logic here
    }
}