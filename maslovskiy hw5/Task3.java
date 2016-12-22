package homework5;

public class Task3 {

	public static void main(String[] args) {
		int[]m = {1,-2,-3,-5,-1,20};
		
		min(m);
		positionPositive(m);

	}

	private static void positionPositive(int[] m) {

		int k = 0  ;
		for(int i=0;i<m.length;i++){
			if(m[i]>0){
				k++;
			}
			if(m[i]>0&&k==2){
				System.out.println("position of second positive number "+ i);
				
			}
			
		}
		
	}

	private static void min(int[] m) {
		int imin=0;
		int min=m[0];
		for(int i=0;i<m.length;i++){
			if(m[i]<min){
				min = m[i];
				imin = i;
			}
		}
		System.out.println("minimum: "+min + " position in the array : "+imin);
		
	}

}
