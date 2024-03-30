
class PopCorn {
    public void taste() {
        System.out.println("salty"); // Print "salty" when the 'taste()' method of PopCorn is called.
    }
}

public class AnonymousInnerClassThatExtendsAClass {
    public static void main(String[] args) {
        PopCorn obj = new PopCorn() {  // Anonymous inner class
            public void taste() {
                System.out.println("spicy"); // Print "spicy" when the 'taste()' method of the anonymous inner class is called.
            }
        };
        obj.taste(); // Invokes the 'taste()' method of the anonymous inner class, so "spicy" will be printed.

        PopCorn obj1 = new PopCorn();
        obj1.taste(); // Invokes the 'taste()' method of the original PopCorn class, so "salty" will be printed.

        Outer3 outer3 = new Outer3();
        outer3.displayGreeting();

//        IHuman human = new ABC();
    }
}

interface Greeting {
    void greet();
}

class Outer3 {
    void displayGreeting() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greeting.greet();
    }
}