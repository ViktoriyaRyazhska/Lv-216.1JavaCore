import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		floatCheck(s);
		maxInt(s);
	}
	
	private static void maxInt(Scanner s) {
		System.out.println("Input first integer number ");
		int a = Integer.parseInt(s.nextLine());
		System.out.println("Input second integer number ");
		int b = Integer.parseInt(s.nextLine());
		System.out.println("Input third integer number ");
		int c = Integer.parseInt(s.nextLine());
		
		if(a>c && a>b){
			System.out.println("The bigest number is " + a);
			if(b>c){
				System.out.println("The smallest number is " + c);
			}else System.out.println("The smallest number is " + b);
			
		}else if(b>a&&b>c){
			System.out.println("The bigest number is " + b);
			if(a>c){
				System.out.println("The smallest number is " + c);
			}else System.out.println("The smallest number is " + a);
						
		}else System.out.println("The bigest number is " + c);
			if(a>b){
				System.out.println("The smallest number is " + b);
			}else System.out.println("The smallest number is " + a);
	}

	public static void floatCheck(Scanner s){
		
		System.out.println("Input first float number ");
		float a = Float.valueOf(s.nextLine());
		System.out.println("Input second float number ");
		float b = Float.valueOf(s.nextLine());
		System.out.println("Input third float number ");
		float c = Float.valueOf(s.nextLine());
		
		if((a>-5&&a<5)&&(b>-5&&b<5)&&(c>-5&&c<5)){
			System.out.println("All this nnumbers are belong to [-5;5]");
		}else 
			System.out.println("Every or some of these numbers doesn't belong to [-5;5]");
	}

}
