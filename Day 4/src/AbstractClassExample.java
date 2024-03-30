abstract class Shape {
    abstract void draw(); // Abstract method

    void move() {
        System.out.println("Moving the shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        circle.move();

        rectangle.draw();
        rectangle.move();
    }
}