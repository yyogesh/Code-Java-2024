
@FunctionalInterface
interface A1
{
    int add(int i, int j);
}


public class LamdaExpressionExample2 {
    public static void main(String[] args) {
//
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};

        A1 obj=(i,j) -> i+j;

        int result=obj.add(5, 4);
        System.out.println(result);
    }
}
