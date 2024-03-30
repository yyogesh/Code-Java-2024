
// Defining the Outer class
class Outer2 {

    // Method within the Outer class
    public void method() {

        // Inner class declaration within the method
        class Inner {

            // Method to calculate and display the sum of two numbers
            public void sum(int num1, int num2) {
                System.out.println("sum=" + (num1 + num2));
            }
        }

        // Creating an instance of the Inner class
        Inner obj = new Inner();

        // Calling the sum() method of the Inner class multiple times with different arguments
        obj.sum(2, 3);
        obj.sum(3, 3);
        obj.sum(8, 9);
    }
}

// Test class to demonstrate the usage of the Outer class and its Inner class
public class MethodLocalInnerClasses {
    public static void main(String[] args) {
        // Creating an instance of the Outer class and calling its method
        new Outer2().method();
    }
}