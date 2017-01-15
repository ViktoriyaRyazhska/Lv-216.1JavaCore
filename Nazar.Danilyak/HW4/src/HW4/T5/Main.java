package HW4.T5;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Car> mass  = new HashSet<Car>();
		mass.add(new Car("Test1",1992));
		mass.add(new Car("Test2",1995));
		mass.add(new Car("Test3",1997));
		mass.add(new Car("Test4",2000));
		mass.add(new Car("Test5",1988));
		String carS=sc.next();
		for (Car car : mass) {
			if (carS.equals(car.model)) {
				System.out.println(car.toString());
			}
		}
		
	}
}