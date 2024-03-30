class A2
{
    public void show() throws ClassNotFoundException
    {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
        Class.forName("Calc");
    }
}
public class DuckingExceptionUsingThrows {
    static {
        System.out.println("Class Loader");
    }
    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        A2 obj=new A2();
        try {
            obj.show();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
