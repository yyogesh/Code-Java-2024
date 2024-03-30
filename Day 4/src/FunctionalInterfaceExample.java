
@FunctionalInterface
interface A2
{
    void show();
//	void run();
}
//class B2 implements A2
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {

//        A2 obj1 = () ->
//            {
//               return System.out.println("in Show");
//            };

        A2 obj = new A2()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	A obj=new A();
        //   	A obj=new B();
        obj.show();
    }
}