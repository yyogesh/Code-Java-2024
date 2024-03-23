
class Calc1
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc1 extends Calc1
{
   // @Override
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

public class MethodOverriding {
    public static void main(String args[])
    {
        AdvCalc1 obj=new AdvCalc1();
        int r1=obj.add(3, 4);
        System.out.println(r1);

        Calc1 x = new AdvCalc1(); // UP casting

        Calc1 x1 = new Calc1();
        AdvCalc1 x2 = (AdvCalc1) x1; // down casting
        x2.add(2, 3);

    }
}
