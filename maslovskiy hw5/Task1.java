package homework5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		String[]s = {"0","January","February","March","April","May","June","July","August","September","October","November","December"};
		int[]m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scn = new Scanner(System.in);
		month(s,m,scn);

	}

	private static void month(String[] s, int[] m, Scanner scn) {
		System.out.println("Input number from 1 to 12");
		int n = Integer.parseInt(scn.nextLine());
		

		for(int i=0;i<s.length;i++){
			if(i==n){
				System.out.print("It's " +s[i] + " and it has ");
			}
		}
		for(int i=0;i<m.length;i++){
			if(i==n){
				System.out.println(m[i] + " days");
			}
		}
		
	}

}
