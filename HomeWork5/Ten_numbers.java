package HomeWork5;

import java.util.Scanner;

public class Ten_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count_num = 10;
		int[] nums = new int[count_num];
		System.out.println("Enter " + count_num + " numbers");
		for (int i = 0; i < count_num; i++){
			nums[i] = s.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < count_num/2; i++ ){
			sum += nums[i];
		}
		
		if (sum > 0) {
			System.out.println("Sum of first 5 element: " + sum);
		}
		else {
			int prod = 1;
			for (int i = count_num/2; i < count_num; i++){
				prod *= nums[i];
			}
			System.out.println("Product of last 5 element:" + prod);
		}
		
		s.close();
	}

}
