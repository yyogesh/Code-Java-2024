class SingletonExample {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private SingletonExample() {
        // Initialization code, if needed
    }

    // Public static method to get the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes of the Singleton class
}

public class Singleton {
    public static void main(String[] args) {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();

        // Both singleton1 and singleton2 should refer to the same instance
        System.out.println(singleton1 == singleton2); // Should print true
    }
}