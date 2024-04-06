package Generic;

public class GenericsMain {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter(5);
        numberPrinter.print(); // output = print::: 5
        TextPrinter textPrinter = new TextPrinter("Hello");
        textPrinter.print();   // output = print::: Hello

        System.out.println("******************************");

        Printer<Integer> integerPrinter = new Printer<Integer>(5);
        integerPrinter.print();   // output = print::: 5

        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();   // output = print::: Hello

        Printer<Double> doublePrinter = new Printer<>(45.34);
        doublePrinter.print();   // output = print::: 45.34

        Printer<Long> longPrinter = new Printer<>(5L);
        longPrinter.print();    // output = print::: 5

        System.out.println("******************************");

        MultiPrinter<Integer, String> multiPrinter = new MultiPrinter<>(5, "Hello");
        multiPrinter.print(); // output = print::: 5 : Hello
    }
}
