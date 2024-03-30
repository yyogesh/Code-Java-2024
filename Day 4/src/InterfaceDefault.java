

interface MyData {
    void draw();

    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
public class InterfaceDefault implements MyData{
    @Override
    public void draw() {
        System.out.print("Drawing a circle");
    }
    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        InterfaceDefault obj = new InterfaceDefault();
        obj.print("");
        obj.isNull("abc");
        // MyData.isNull();
    }
}
