
class Outer4 {
    static class Outer$Inner {
        public void display() {
            System.out.println("Outer$Inner");
        }
    }
}

public class StaticNestedClasses {
    public static void main(String[] args) {
        // Create an instance of the static nested class Outer$Inner and call its display() method.
        new Outer4.Outer$Inner().display();
    }
}