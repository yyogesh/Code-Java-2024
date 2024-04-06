package BoundedGenerics;

class Human {}

public class MainClass {
    public static void main(String arg[]) {
        AnimalPrinter<Cat> animalPrinter1 = new AnimalPrinter<>(new Cat("Jim", "brown", 2));
        animalPrinter1.print();
        AnimalPrinter<Dog> animalPrinter2 = new AnimalPrinter<>(new Dog("Rocky", "black", 5));
        animalPrinter2.print();
//        AnimalPrinter<Dog> animalPrinter3 = new AnimalPrinter<>(new Human());
//        animalPrinter3.print();
    }
}
