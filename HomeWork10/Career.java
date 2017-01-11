package HomeWork10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Career {

	public static void main(String[] args) {
		String fileIn = "file1.txt";
		String fileOut = "file2.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		List<String> myCollection = new ArrayList<String>();
		int count = 0;
		try {
			fr = new FileReader(fileIn);
			br = new BufferedReader(fr);
			
			
			String s;
			
			while ( (s = br.readLine()) != null) {
				myCollection.add(s);
				count++;
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int maxLength = myCollection.get(0).length();
		String maxStr = myCollection.get(0);
		String strName = "";
		String strBirth = "";
		for (String string : myCollection ) {
			if (string.length() > maxLength){
				maxLength = string.length();
				maxStr = string;
			}
			if (string.contains("Name")){
				strName = string;
			}
			if (string.contains("Date of birth")){
				strBirth = string;
			}
		}
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileOut);
			bw = new BufferedWriter(fw);
			bw.write(count + "\n");
			bw.write(maxStr + "\n");
			bw.write(strName + "\n");
			bw.write(strBirth);
			
			bw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}


		
	}

}
