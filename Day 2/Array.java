public class Array {
	public static void main(String[] args) {
		int i1 = 5;
		int j = 6;
		int k = 7;
		int num[] = { 5, 6, 7 };
		// int x = [1, 2, 3, 4, 5, 6, 7]
		int num1[] = new int[4];

		// int nums[]= {3,7,2,4};
		// nums[1]=6;
		// System.out.println(nums[1]);

		int nums[] = new int[4];
		nums[0] = 4;
		nums[1] = 8;
		nums[2] = 3;
		nums[3] = 9;

		// System.out.println(nums[0]);
		// System.out.println(nums[1]);
		// System.out.println(nums[2]);
		// System.out.println(nums[3]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		for (int m : nums) {
			System.out.println(m);
		}

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}

		// int nums[][]=new int [3][4];
		// //inr random=0;
		// //int random=(int)Math.random()*100;

		// for(int i=0;i<3;i++)
		// {
		// for(int j=0;j<4;j++)
		// {
		// nums[i][j]=(int)Math.random()*100;
		// System.out.println(nums[i][j]);
		// }
		// System.out.println();
		// }

		// for(int i=0;i<3;i++)
		// {
		// for(int j=0;j<4;j++)
		// {
		// System.out.println(nums[i][j]+" ");
		// }
		// System.out.println();
		// }

		// for(int n[]:nums)
		// {
		// for(int m:n)
		// {
		// System.out.println(m+" ");
		// }
		// System.out.println();
		// }
	}
}
