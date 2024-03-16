public class Variable {
    public static void main(String[] args) {
        System.out.print(3 + 5);
        System.out.print(8 + 7);
        // int num1=3;
        // int num2=5;
        // System.out.println(num1+num2);
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        int num3 = 9;
        byte by = 127;
        short sh = 558;
        long l = 5854l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k';

        boolean b = true;
        System.out.println("****************************************************************");
        int num4 = 0b101;
        System.out.println(num4);
        int num23 = 0x7E;
        System.out.println(num23);

        int num33 = 10_00_00_000;
        System.out.println(num33);

        byte b1 = 127;
        int a = b1;
        System.out.println(b1);
        System.out.println(a);

        byte b3 = 125;
        int a0 = b3;
        System.out.println(b3);
        System.out.println(a0);

        int aa = 44;
        byte k = (byte) aa;

        float f2 = 5.6f;
        int t = (int) f2;

        int a2 = 2567;
        byte b2 = (byte) a;
        System.out.println(k);

        byte a3 = 10;
        byte b4 = 20;
        int t1 = a3 * b4;
        System.out.println(t1);

        // int num1=7;
        // int num2=5;
        // int result=num1+num2;
        // System.out.println(result)

        int num = 7;
        // num=num+2;
        // num+=2;
        // num*=2;

        num++; // post increment
        ++num; // pre increment
        num--; // post decrement
        --num; // pre decrement
        System.out.println(num);

        int result1 = num++; // fetch the value and then increment
        System.out.println(result1);

        int x = 6;
        int y = 5;
        // boolean result= x<y;
        // boolean result= x>y;
        // boolean result= x>=y;
        // boolean result= x<=y;
        // boolean result= x!=y;
        boolean result2 = x == y;
        System.out.println(result2);

        // double a2=8.8;
        // double b=9.8;
        // boolean res = a<=b;
        // boolean res = a>=b;

        // System.out.println(res);

        int x2 = 8;
        // System.out.println("Hello");
        // System.out.println("Bye");

        // int x=18;
        // if(x>10) {
        // System.out.println("Hello");
        // }

        // if(true) {
        // System.out.println("Hello");
        // }

        // int x=28;
        // if(x>10 && x<=20) { //11-20
        // System.out.println("Hello");
        // }
        // System.out.println("Bye");

        // int x=28;
        // if(x>10 && x<=20) { //11-20
        // System.out.println("Hello");
        // }
        // else
        // System.out.println("Bye");

        // int x=8;
        // int y=7;
        // if(x>y) {
        // System.out.println(x);
        // System.out.println("Thankyou");
        // }
        // else
        // System.out.println(y);

        // if(x>y && x>z) //false
        // System.out.println(x);
        // else if(y>z)
        // System.out.println(y);
        // else
        // System.out.println(z);

        // int n=5;
        // int result=0;
        // result = n % 2 == 0 ? 10 : 20;
        // System.out.println(result);

        // switch(n) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter a valid number");
        // }

        String str = "123";
        int abc = Integer.parseInt(str);

        int i = 1;

        // while(true)
        // {
        // System.out.println("Hi"+ i);
        // i++;
        // }

        while (i <= 4) {
            System.out.println("Hi" + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }

        // int i=1;
        // do
        // {
        // System.out.println("Hi"+i);
        // i++;
        // }
        // while(i<=4);

        // for(int i=0;i<=4;i++)
        // {
        // System.out.println("Hi"+i);
        // }

        // int i=1;
        // for(;i<=5;)
        // {
        // System.out.println("DAY"+i);
        // i++;
        // }

        // For loop:-
        // If you know how many iterations you want to go for loop
        // (intiliazing vaue, condition, increment or decrement)

        // While loop:-
        // When you need to read the file go for while loop, if the number of iterations
        // is not known.

        // - For loop can also be used as a while.

        // Do While Loop:-
        // If you condition get false but you want to exceute the code at least once.

        char ac = 'a';

        String str1String = "adsf";
    }
}
