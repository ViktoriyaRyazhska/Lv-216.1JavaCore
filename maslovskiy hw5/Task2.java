package homework5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int[]m = new int[10];
		Scanner scn = new Scanner(System.in);
		calc(m,scn);

	}

	private static void calc(int[] m, Scanner scn) {
		int sum=0;
		int pr=1;
		for(int i=0;i<m.length;i++){
			System.out.println("Input number");
			m[i] = Integer.parseInt(scn.nextLine());	
		}
		for(int i=0;i<5;i++){
			if(m[i]>0){
				sum+=m[i];
				
			}else
				sum=0;
			if(m[i]<0){
				for(int z=5;z<m.length;z++){
					pr=pr*m[z];
				}
					System.out.println("Product of the last five numbers of array " + pr);
				break;
			}	
		}
		System.out.println("Sum of the first five numbers " + sum);
	}
}
