public class Main1 {

	static int [] q = new int [4];	
	static double [] p = new double [4];
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		q[0] = p1.getQuantity();
		q[1] = p2.getQuantity();
		q[2] = p3.getQuantity();
		q[3] = p4.getQuantity();
		compareQuantity(q);
		
		if(compareQuantity(q)==p1.getQuantity()){
			System.out.println(p1.getName());
		}else if (compareQuantity(q)==p2.getQuantity()){
			System.out.println(p2.getName());
		}else if (compareQuantity(q)==p3.getQuantity()){
			System.out.println(p3.getName());
		}else if (compareQuantity(q)==p4.getQuantity())
			System.out.println(p4.getName());
		p[0] = p1.getPrice();
		p[1] = p2.getPrice();
		p[2] = p3.getPrice();
		p[3] = p4.getPrice();
		comparePrice(p);
		
		if(comparePrice(p)==p1.getPrice()){
			System.out.println(p1.getName() + " " +p1.getQuantity());
		}else if(comparePrice(p)==p2.getPrice()){
			System.out.println(p2.getName() + " " +p2.getQuantity());
		}else if(comparePrice(p)==p3.getPrice()){
			System.out.println(p3.getName() + " " +p3.getQuantity());
		}else if(compareQuantity(q)==p4.getQuantity())
			System.out.println(p4.getName() + " " + p4.getQuantity());
		
	}
	public static int compareQuantity(int [] q){
		int max = q[0];
		for(int i = 0; i<q.length;i++){
			if(q[i]>max){
				max = q[i];
			}
		}
		return max;
		
	}
	public static double comparePrice(double[] p){
		double max = p[0];
		for(int i =0;i<p.length;i++){
			if(p[i]>max){
				max = p[i];
			}
		}
		
		return max;
	}

}
