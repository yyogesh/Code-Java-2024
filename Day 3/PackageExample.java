
//import tools.Calc;
//import tools.AdvCalc;
//import tools.*;
import other.tools.*;
//import.other.*;

//import java.util.ArrayList;
import java.lang.*;

public class PackageExample {
	public static void main(String args[]) {
		// ArrayLis list=new ArrayList();

		Calc obj = new Calc();
		AdvCalc obj1 = new AdvCalc();

		A obj2 = new A();

		System.out.println();
	}
}

class Message {
	public void printMessage(int message) {
		System.out.println("Message primitive: " + message);
	}

	public void printMessage(Integer message) {
		System.out.println("Message object: " + message);
	}
}

class Main {
	public static void main(String[] ars) {
		Message ob = new Message();
		ob.printMessage(5);
	}
}