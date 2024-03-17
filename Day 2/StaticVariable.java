class Mobile {
    String brand;
    int price;
    String network;
    // String name;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
	{
		System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
	}

    static {
        name = "Samsung";
        System.out.println("static block " + name);
    }

}

public class StaticVariable {
    public static void main(String[] args) {
       // Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile.name = "asfd";
        Mobile.show1(obj1);
    }
}
