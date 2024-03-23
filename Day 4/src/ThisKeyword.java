class Human1
{
    private int age;
    private String name;

    public Human1() {

    }

    public Human1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void SetAge(int age, Human1 obj)
    {
        //Human obj1=new Human();
        Human1 obj1=obj;
        obj1.age=age;
        age=age;
    }

//	public void SetAge(int a)
//	{
//		age=a;
//	}


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

//	public void setName(String n)
//	{
//		name=n;
//	}

}

public class ThisKeyword {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human1 obj=new Human1();

        Human1 obj1=new Human1(12, "adf");

        new Human1().setName("asdfsafd");

        obj.SetAge(30, new Human1());
//		obj.SetAge(30);
        obj.setName("ABC");

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}