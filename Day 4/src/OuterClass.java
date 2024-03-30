
// Defining the Outer class
// Accessing inner class code from static area of class.
public class OuterClass {

    // Inner class declaration
    class Inner {

        // Method to display a message
        public void display() {
            System.out.println("Inner class");
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating an instance of the Outer class and then an instance of the Inner class
        // The 'new Outer()' part creates an instance of the Outer class,
        // and the 'new Inner()' part creates an instance of the Inner class within the Outer class.
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner outerInner =  outerClass.new Inner();
        outerInner.display();

        OuterClass.Inner obj = new OuterClass().new Inner();

        // Calling the display() method of the Inner class through the 'obj' reference
        obj.display();

        // dot notation
    }
}