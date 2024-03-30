class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
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
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both singleton1 and singleton2 should refer to the same instance
        System.out.println(singleton1 == singleton2); // Should print true
    }
}