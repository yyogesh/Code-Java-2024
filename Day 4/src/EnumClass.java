enum Laptop1{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop1()
    {
        price=500;
    }

    private Laptop1(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
        System.out.println("in Laptop" + this.name());
    }
}

public class EnumClass {
    public static void main(String[] args) {

        Laptop1 lap=Laptop1.Mackbook;
    	System.out.println(lap+ " Without loop : "+lap.getPrice());

        for(Laptop1 lap1 : Laptop1.values())
        {
            System.out.println(lap1+" : "+lap1.getPrice());
        }
    }
}