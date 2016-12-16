package lesson3;

public class RunPerson {
	/*
	 * Homework
	 * Console Application project in Java
	 * Run class Person
	 */

	public static void main(String[] args) {
		//create 5 objects of Person
		Person p1 = new Person();
            p1.setName("Ivanenko");
            p1.setBirthYear(1965);
        
        Person p2 = new Person();
            p2.input("Petrenko", 1975);
            
        Person p3 = new Person("Sydorenko", 1985);
        
        Person p4 = new Person("Tarasenko", 1981);
        
        Person p5 = new Person("Stepanenko", 1952);
            p5.changeName("Pavlenko");
            
        //type and output information about them
        p1.output();
        p1.age();
        p2.output();
        p2.age();
        p3.output();
        p3.age();
        p4.output();
        p4.age();
        p5.output();
        p5.age();

	}

}
