package HomeWork5;

import java.util.Scanner;

public class FiveNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count_num = 5;
		int[] nums = new int[count_num];
		System.out.println("Enter " + count_num + " numbers");
		for (int i = 0; i < count_num; i++){
			nums[i] = s.nextInt();
		}
		int position = 0;
		for (int i = 0; i < count_num; i++){
			if (nums[i] > 0){
				position++;
				if (position == 2){
					System.out.println("Position of second positive number:" + (i+1));
					break;
				}
			}
		}
		
		int min = nums[0];
		int min_ind = 0;
		for (int i = 1; i < count_num; i++){
			if (nums[i] < min) {
				min  = nums[i];
				min_ind = i;
			}
		}
		System.out.println("Minimum of number: " + min + ", position of min numbr: " + (min_ind + 1));
		s.close();

	}

}
