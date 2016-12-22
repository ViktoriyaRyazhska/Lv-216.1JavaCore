package homework5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		int[]m = new int[10];
		Scanner scn = new Scanner(System.in);
		
		product(m, scn);
	}

	private static void product(int[] m,Scanner scn) {
		
		for(int i=0;i<m.length;i++){
			System.out.println("Input number");
			int tmp = Integer.parseInt(scn.nextLine());
				if(tmp>0){
					m[i] = tmp;
				}else
					break;
		}
		int p = 1;
		for(int z=0;z<m.length;z++){
			if(m[z]%2==0 && m[z]>0){
				p=p*m[z];
			}else if(m[z]<0){
				p=0;
			}
		}
		System.out.println("product of all entered even numbers : "+p);
	}

}
