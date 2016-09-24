package Project;

import java.io.*;
import java.util.*;

public class cypher {
	public static void main(String[] args) throws IOException {
		
		String name;
		
		
		Scanner console = new Scanner(System.in);
		
		Map<String,String> Polybius = new HashMap<String, String>();
		
		//encrypting
		Polybius.put("P", "AA");
		Polybius.put("H", "AD");
		Polybius.put("0", "AF");
		Polybius.put("Q", "AG");
		Polybius.put("G", "AV");
		Polybius.put("6", "AX");
		
		Polybius.put("4", "DA");
		Polybius.put("M", "DD");
		Polybius.put("E", "DF");
		Polybius.put("A", "DG");
		Polybius.put("1", "DV");
		Polybius.put("Y", "DX");
		
		Polybius.put("L", "FA");
		Polybius.put("2", "FD");
		Polybius.put("N", "FF");
		Polybius.put("O", "FG");
		Polybius.put("F", "FV");
		Polybius.put("D", "FX");
		
		Polybius.put("X", "GA");
		Polybius.put("K", "GD");
		Polybius.put("R", "GF");
		Polybius.put("3", "GG");
		Polybius.put("C", "GV");
		Polybius.put("V", "GX");
		
		Polybius.put("S", "VA");
		Polybius.put("5", "VD");
		Polybius.put("Z", "VF");
		Polybius.put("W", "VG");
		Polybius.put("7", "VV");
		Polybius.put("B", "VX");
		
		Polybius.put("J", "XA");
		Polybius.put("9", "XD");
		Polybius.put("U", "XF");
		Polybius.put("T", "XG");
		Polybius.put("I", "XV");
		Polybius.put("8", "XX");
		
		Polybius.put(".", "PA");
		Polybius.put(",", "PD");
		Polybius.put("‰", "PF");
		Polybius.put("Ã", "PG");
		Polybius.put("-", "PV");
		Polybius.put(":", "PX");
		
		Polybius.put("[", "BA");
		Polybius.put("]", "BD");
		Polybius.put("(", "BF");
		Polybius.put(")", "BG");
		Polybius.put(";", "BV");
		Polybius.put("'", "BX");
		
		Polybius.put("_", "CA");
		Polybius.put("\"", "CD");
		Polybius.put("?", "CF");
		Polybius.put("!", "CG");
		Polybius.put("*", "CV");
		Polybius.put("'", "CX");
		
		Polybius.put("=", "EA");
		Polybius.put("/", "ED");
		Polybius.put("^", "EF");
		Polybius.put("~", "EG");
		Polybius.put(">", "EV");
		Polybius.put("<", "EX");
		
		//decrypting
		Polybius.put("AA", "P");
		Polybius.put("AD", "H");
		Polybius.put("AF", "0");
		Polybius.put("AG", "Q");
		Polybius.put("AV", "G");
		Polybius.put("AX", "6");
		
		Polybius.put("DA", "4");
		Polybius.put("DD", "M");
		Polybius.put("DF", "E");
		Polybius.put("DG", "A");
		Polybius.put("DV", "1");
		Polybius.put("DX", "Y");
		
		Polybius.put("FA", "L");
		Polybius.put("FD", "2");
		Polybius.put("FF", "N");
		Polybius.put("FG", "O");
		Polybius.put("FV", "F");
		Polybius.put("FX", "D");
		
		Polybius.put("GA", "X");
		Polybius.put("GD", "K");
		Polybius.put("GF", "R");
		Polybius.put("GG", "3");
		Polybius.put("GV", "C");
		Polybius.put("GX", "V");
		
		Polybius.put("VA", "S");
		Polybius.put("VD", "5");
		Polybius.put("VF", "Z");
		Polybius.put("VG", "W");
		Polybius.put("VV", "7");
		Polybius.put("VX", "B");
		
		Polybius.put("XA", "J");
		Polybius.put("XD", "9");
		Polybius.put("XF", "U");
		Polybius.put("XG", "T");
		Polybius.put("XV", "I");
		Polybius.put("XX", "8");	
				
		
		//System.out.print("Enter your name: ");
		//name= console.nextLine();		
		
		
		//String [] singleChar = name.split("");
		/*
		for(int i=0; i < name.length(); i++)
		{
			System.out.print(Polybius.get(singleChar[i].toUpperCase()));
		}
		*/
		BufferedReader br = new BufferedReader(new FileReader("WarAndPeace-LeoTolstoy.txt"));
		
		String line=null;
		char letter = 0;
		
	    File file = new File("Enc.txt");
	    file.createNewFile();

	    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
			while((line = br.readLine()) != null)
			{
				int i, j;
				String[] words = line.split(" ");
				for(i=0; i < words.length; i++)
				{
				String word = words[i];
					for(j=0; j < word.length(); j++)
					{
						letter = word.charAt(j);	
						String s = (Character.toString(letter).toUpperCase());
						//System.out.print(Polybius.get(s));
						writer.write(Polybius.get(s));
					}
				}
				
				
			}//while
			br.close();
			writer.flush();
			writer.close();
		}
	static void Encrypt(char letter) throws IOException
	{
		Map<String,String> Polybius = new HashMap<String, String>();
		
		//encrypting
		Polybius.put("P", "AA");
		Polybius.put("H", "AD");
		Polybius.put("0", "AF");
		Polybius.put("Q", "AG");
		Polybius.put("G", "AV");
		Polybius.put("6", "AX");
		
		Polybius.put("4", "DA");
		Polybius.put("M", "DD");
		Polybius.put("E", "DF");
		Polybius.put("A", "DG");
		Polybius.put("1", "DV");
		Polybius.put("Y", "DX");
		
		Polybius.put("L", "FA");
		Polybius.put("2", "FD");
		Polybius.put("N", "FF");
		Polybius.put("O", "FG");
		Polybius.put("F", "FV");
		Polybius.put("D", "FX");
		
		Polybius.put("X", "GA");
		Polybius.put("K", "GD");
		Polybius.put("R", "GF");
		Polybius.put("3", "GG");
		Polybius.put("C", "GV");
		Polybius.put("V", "GX");
		
		Polybius.put("S", "VA");
		Polybius.put("5", "VD");
		Polybius.put("Z", "VF");
		Polybius.put("W", "VG");
		Polybius.put("7", "VV");
		Polybius.put("B", "VX");
		
		Polybius.put("J", "XA");
		Polybius.put("9", "XD");
		Polybius.put("U", "XF");
		Polybius.put("T", "XG");
		Polybius.put("I", "XV");
		Polybius.put("8", "XX");
		
		Polybius.put(".", "PA");
		Polybius.put(",", "PD");
		Polybius.put("‰", "PF");
		Polybius.put("Ã", "PG");
		Polybius.put("-", "PV");
		Polybius.put(":", "PX");
		
		Polybius.put("[", "BA");
		Polybius.put("]", "BD");
		Polybius.put("(", "BF");
		Polybius.put(")", "BG");
		Polybius.put("{", "BV");
		Polybius.put("}", "BX");
		//System.out.println(letter);
		String s = (Character.toString(letter).toUpperCase());

		System.out.print(Polybius.get(s));
		
	    File file = new File("Enc.txt");
	    file.createNewFile();

	    BufferedWriter writer = new BufferedWriter(new FileWriter(file));

	    try {
			writer.write(Polybius.get(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    writer.flush();
	    writer.close();

	}//Encrypt
}
	
