package homework.dog;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<>();
		list.add(new Dog("Name1", Breed.TYPE1, 1));
		list.add(new Dog("Name2", Breed.TYPE2, 2));
		list.add(new Dog("Name2", Breed.TYPE3, 3));

		int t = 0;
		int max = list.get(0).age;
		String maxName = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).age >= max) {
				max = list.get(i).age;
				maxName = list.get(i).name;
			}
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).name.equals(list.get(j).name)) {
					t++;
				}
			}
		}
		
		
		System.out.println("кількість повторень name [ " + t + " ] ");
	System.out.println("найстаріша собака [ "+maxName+"]");
	}

}
