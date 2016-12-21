package HomeWork4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork4_1_A {
	
	public static void InTheRange(float num){
		if ((num >= -5) && (num <= 5)) {
			System.out.println("The number is in range [-5;5]");
		}
		else {
			System.out.println("The number is out of the range [-5;5]");
		}
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 float numbers");
		
		float num1 = Float.parseFloat(br.readLine());
		InTheRange(num1);
		
		float num2 = Float.parseFloat(br.readLine());
		InTheRange(num2);
		
		float num3 = Float.parseFloat(br.readLine());
		InTheRange(num3);
		
	}

}
