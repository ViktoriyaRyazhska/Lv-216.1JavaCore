package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinAndMax {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		findMin(a, b, c);
		
	
	}
	
	public static void findMin(int a, int b , int c){
		if(a<b && a<c ){
			System.out.println("min is : "+a);
		}else if(b<a && b<c){
			System.out.println("min is : "+b);
		}else if(c<a && c<b){
			System.out.println("min is : "+c);
		}
		
		if(a>=b && b>=c ){
			System.out.println("max is : "+a);
		}else if(b>=a && b>=c){
			System.out.println("max is : "+b);
		}else if (c>=a && c>=a){
			System.out.println("max is : "+c);
		}
	}

}
