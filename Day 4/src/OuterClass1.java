// Accessing inner class code from the instance area of an outer class.
// Defining the Outer class
class Outer {

    // Inner class declaration
    class Inner {

        // Method to display a message
        public void display() {
            System.out.println("Inner class");
        }
    }

    // Method to access the Inner class
    public void access() {
        // Creating an instance of the Inner class within the Outer class
        Inner innerClass = new Inner();

        // Calling the display() method of the Inner class
        innerClass.display();
    }
}

// Test class to demonstrate the usage of the Outer class and its Inner class
public class OuterClass1 {
    public static void main(String[] args) {
        // Creating an instance of the Outer class
        Outer outerClass = new Outer();

        // Calling the access() method of the Outer class, which internally accesses the Inner class
        outerClass.access();
    }
}