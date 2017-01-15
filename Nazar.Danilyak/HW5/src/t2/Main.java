package t2;

public class Main {
	public static void main(String[] args) {
		Workers[] workers = new Workers[5];

		for (int i = 0; i < workers.length; i++) {
			workers[i]=new Workers(i+1,"name"+(i+1),(i+1)*1000);

		}
		for (Workers workers2 : workers) {
			System.out.println(workers2);
		}
	}
}
