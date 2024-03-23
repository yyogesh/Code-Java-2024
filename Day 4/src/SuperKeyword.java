class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }

    public void print() {
        System.out.println("Print function");
    }
}

class B extends A
{
    public B()
    {
//		super();
        super(5);
        super.print();
        System.out.println("in B");
    }
    public B(int n)
    {
		// super();   //call default constructor of super class
       // super(n);
        this();
        System.out.println("in B int");
       // System.out.print()
    }
}


public class SuperKeyword {
}
