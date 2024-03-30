@Deprecated
class A8
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }
}

class B8 extends A8
{
   @Override
//	public void showTheDataWhichBelongToThisClass()
    public void showTheDataWhichBelongsToThisClass()

    {
        System.out.println("in show B");
    }
}

public class AnnotationsExample {
    public static void main(String[] args) {

        B8 obj=new B8();
        obj.showTheDataWhichBelongsToThisClass();

    }
}
