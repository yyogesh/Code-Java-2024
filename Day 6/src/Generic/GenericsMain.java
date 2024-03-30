package Generic;

public class GenericsMain {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter(5);
        numberPrinter.print(); // output = print::: 5
        TextPrinter textPrinter = new TextPrinter("Hello");
        textPrinter.print();   // output = print::: Hello
    }
}
