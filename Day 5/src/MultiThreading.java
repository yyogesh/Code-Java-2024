class A3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class B3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws NumberFormatException {

        A3 obj1=new A3();
        B3 obj2=new B3();
//    	obj1.show();
//    	obj2.show();
        obj1.start();
        obj2.start();
    }

}