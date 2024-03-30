// Defining the Outer class
class Outer1 {

    // Inner class declaration
    class Inner {

        // Method to display a message
        public void display() {
            System.out.println("Inner class");
        }
    }
}

// Test class to demonstrate different ways of creating and using the Inner class
public class OuterClass2 {
    public static void main(String[] args) {

        // Way 1: Object creation using two steps
        Outer1 objOuter = new Outer1(); // Creating an instance of the Outer class
        Outer1.Inner objInner = objOuter.new Inner(); // Creating an instance of the Inner class within the Outer class
        objInner.display(); // Calling the display() method of the Inner class

        // Way 2: Object creation in one step
        Outer1.Inner objiInner1 = new Outer1().new Inner(); // Creating an instance of the Inner class within a new instance of the Outer class
        objiInner1.display(); // Calling the display() method of the Inner class

        // Way 3: Object creation and method call in a single line
        new Outer1().new Inner().display(); // Creating an instance of the Inner class within a new instance of the Outer class and calling the display() method
    }
}