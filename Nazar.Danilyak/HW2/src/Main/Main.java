package Main;

import Persone.Persone;

public class Main {
	public static void main(String[] args) {
		Persone persone1 = new Persone();
		persone1.input("Test1", 1998);
		Persone persone2 = new Persone("Test2", 1997);
		Persone persone3 = new Persone("Test3", 1996);
		Persone persone4 = new Persone("Test4", 1995);
		Persone persone5 = new Persone("Test5", 1994);

		

		
		System.out.println(persone1.output()+" age "+persone1.age(2016));
		System.out.println(persone2.output()+" age "+persone2.age(2016));
		System.out.println(persone3.output()+" age "+persone3.age(2016));
		System.out.println(persone4.output()+" age "+persone4.age(2016));
		System.out.println(persone5.output()+" age "+persone5.age(2016));
	}
}