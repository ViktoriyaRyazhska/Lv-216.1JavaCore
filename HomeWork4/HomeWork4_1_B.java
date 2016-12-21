package HomeWork4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_1_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 integer numbers");
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int max = 0, min = 0;
		if ((num1 > num2) && (num1 > num3)){
			max = num1;
		}
		else { 
			if ((num2 > num1) && (num2 > num3)){
				max = num2;
			}
			else {
				if ((num3 > num1) && (num3 > num2)){
					max = num3;
				}
			}
		}
		
		if ((num1 < num2) && (num1 < num3)){
			min = num1;
		}
		else { 
			if ((num2 < num1) && (num2 < num3)){
				min = num2;
			}
			else {
				if ((num3 < num1) && (num3 < num2)){
					min = num3;
				}
			}
		}
		System.out.println("Max of the numbers " + num1 + ", " + num2 + ", " + num3 + " is " + max);
		System.out.println("Min of the numbers " + num1 + ", " + num2 + ", " + num3 + " is " + min);
			
	}
	
	

}
