package HW4.T2;

import java.awt.Checkbox;

public class Numbers {
	private int[] array ;
	public Numbers(int[] array) {
		super();
		this.array = array;
	}
	private boolean check(){
		boolean check=true ;
		for (int i = 0; i < array.length; i++) {
			if(i<5){
				if(array[i]<=0){
					if(check){
						check=false;
					}
				}
			}
		}
		
		
		return check;
	}
	public int summ(){
		int summ = 0;
		if(check()){
			for (int i = 0; i < array.length; i++) {
				if(i<5){
					summ+=array[i];
				}
			}
		}else{
			for (int i = 0; i < array.length; i++) {
				if(i>=5){
					summ+=array[i];
				}
			}
		}
		return summ;
	}
}