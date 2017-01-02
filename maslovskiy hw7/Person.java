package homework7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Person{

	public static void main(String[] args) {

		Map<String,String> mapa = new HashMap<String,String>();
		mapa.put("Yanukovich", "Victor");
		mapa.put("Yushchenko", "Victor ");
		mapa.put("Lyashko","Oleg");
		mapa.put("Poroshenko","Petro");
		mapa.put("Klitschko","Vitaliy");
		mapa.put("Merkel","Angela");
		mapa.put("Kuchma","Leonid");
		mapa.put("Tyahnybok","Oleg");
		mapa.put("Tymoshenko","Yuliya");
		mapa.put("Shevchenko","Andriy");		
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			System.out.println(entry.getKey() + " "	+ entry.getValue());
			}
		System.out.println();
		sameName(mapa);
		System.out.println();
		removing(mapa);
	
	}

	private static void removing(Map<String, String> mapa) {

		for (Iterator i = mapa.entrySet().iterator(); i.hasNext();){
			   Map.Entry entry = (Map.Entry) i.next();
			   if(entry.getValue() == "Oleg")
			   i.remove();
			}
		System.out.println(mapa);
		
	}

	private static void sameName(Map<String, String> mapa) {
		int sameName = 0;
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			for (Map.Entry<String, String> entry2 : mapa.entrySet()) {
				if ((entry.getValue() == entry2.getValue())&&(entry.getKey()!=entry2.getKey())) {
					sameName++;
				}
			}
		}
		if(sameName>0){
			System.out.println("at least 2 names are even");
		}else
			System.out.println("there are no even names");
		
	}
}
