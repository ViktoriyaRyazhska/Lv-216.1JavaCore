package homework10;

import java.io.*;
import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		String txt1 = "1.txt";
		String txt2 = "2.txt";
		String name = "Andriy Maslovskiy";
		String date = "29.01.1993";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(txt1);
			br = new BufferedReader(fr);
			String s = null;

			while ((s = br.readLine()) != null) {
				list.add(s);

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int count = 0;
		int k = 0;
		int max = list.get(0).length();
		for (String s : list) {
			count++;
			if (max < s.length()) {
				max = s.length();
			}
			if (s.contains(name.toLowerCase())) {
			}
			if (s.contains(date)) {
			}
		}
		list2.add(String.valueOf(count));
		list2.add(String.valueOf(max));
		list2.add(name);
		list2.add(date);

		try {
			fw = new FileWriter(txt2);
			bw = new BufferedWriter(fw);
			System.out.println("Write data to file: " + txt2);
			for (String s : list2) {
				bw.write(s + "\n");
			}
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
