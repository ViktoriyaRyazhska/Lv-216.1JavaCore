
public class MainDog {

	public static void main(String[] args) {
	
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		dogAge(d1, d2, d3);
		equalsName(d1, d2, d3);
			
	}

	private static void equalsName(Dog d1, Dog d2, Dog d3) {

		if(d1.getName().equals(d2.getName())){
			System.out.println("Name of the first dog is the same for the second dog");
		}
			if(d2.getName().equals(d3.getName())){
			System.out.println("Name of the second dog is the same for the third dog");
		} 
			if(d1.getName().equals(d3.getName())){
			System.out.println("Name of the first dog is the same for the third dog");
		}
			}

	private static void dogAge(Dog d1,Dog d2,Dog d3) {
		
		if((d1.getAge()>d2.getAge())&&d1.getAge()>d3.getAge()){
			System.out.println(d1.getName() + d1.getBreed() + " is the oldest dog");
		}else if((d2.getAge()>d1.getAge())&&d2.getAge()>d3.getAge()){
			System.out.println(d2.getName() +d2.getBreed() + " is the oldest dog");
		}else 
			System.out.println(d3.getName() + d3.getBreed() +" is the oldest dog");		
	}
	
}
