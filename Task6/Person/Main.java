package ua.bilas2;

public class Main {

	public static void main(String[] args) {
	
		Person[] persons = new Person[6];
		
		persons[0] = new Teacher("Olga");
		persons[1] = new Teacher("Irina");
		
		persons[2] = new Cleaner("Inna");
		persons[3] = new Cleaner("Igor");
		
		persons[4] = new Student("Oleg");
		persons[5] = new Student("Tana");
		
		for (Person person : persons) {
			person.print();
		}
		
		for (Person person : persons) {
			if (person instanceof Staff) {
				((Staff) person).salary();
			} else {
				System.out.println("you dont have workers.");
			}
			
		}
		

	}
}
