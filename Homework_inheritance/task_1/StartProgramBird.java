package task_1;

public class StartProgramBird {
	public static void main(String[] args) {
		Bird bird1[] = new Bird[4];
		bird1[0] = new Swallow(true,true);
		bird1[1] = new Eagle(true,true);
		bird1[2] = new Chicken(true,true);
		bird1[3] = new Penguin(false,true);
		bird1[0].fly();
		System.out.println(bird1[0]);
		bird1[1].fly();
		System.out.println(bird1[1]);
		bird1[2].fly();
		System.out.println(bird1[2]);
		bird1[3].fly();
		System.out.println(bird1[3]);
		
	}
}
