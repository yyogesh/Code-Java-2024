public class HelloWorld {
    /**
     * Prints "Hello World" to the console.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String a[]) {
        System.out.println("Hello Wrold");

        int i, j;
        i = 100;
        j = 300;
        while(++i < --j);
        System.out.println(i);
    }
}