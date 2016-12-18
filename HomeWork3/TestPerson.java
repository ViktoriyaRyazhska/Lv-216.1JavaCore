
public class TestPerson {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("Taras");
		person1.setBirthYear(1980);
		
		Person person2 = new Person();
		person2.input("Petro", 1990);
		
		Person person3 = new Person("Mariya", 1995);
		
		Person person4 = new Person("Oksana", 1996);
		person4.changeName("Olha");
		
		Person person5 = new Person("Igor", 2000);
		System.out.println("The age of " + person5.getName() + ": " + person5.age());
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		
	}

}
