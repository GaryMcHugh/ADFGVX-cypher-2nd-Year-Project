package gmit;

import java.io.*;
import java.util.*;

public class cypher {
	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in);
		
		String key;
		
	    System.out.print("Enter the Key: ");
	    key = console.nextLine();
	
	    Encrypt();
	    Decrypt();
	    	
		}
	
	static void Encrypt() throws IOException
	{
		long startTime = System.currentTimeMillis();
		//O(log n)
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
		
		String line=null;
		char letter = 0;
		
		BufferedReader br = new BufferedReader(new FileReader("WarAndPeace-LeoTolstoy.txt"));
		
	    File file = new File("Enc.txt");
	    file.createNewFile();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		while((line = br.readLine()) != null)
		{
			int i, j;
			String[] words = line.split(" ");
			//O(n^2)
			for(i=0; i < words.length; i++)
			{
				String word = words[i];
				for(j=0; j < word.length(); j++)
				{
					letter = word.charAt(j);	
					String s = (Character.toString(letter).toUpperCase());
					writer.write(Polybius.get(s));
					writer.write(" ");
				}
			}							
		}//while
		System.out.println();
		System.out.println("Encrypted file successfully");
		
		br.close();
		writer.flush();
		writer.close();  
		System.out.println("Running time (ms): " + (System.currentTimeMillis() - startTime) + " (Encryption)");
		//600ms
	}//Encrypt
	static void Decrypt() throws IOException
	{
		long startTime = System.currentTimeMillis();
		//O(log n)
		Map<String,String> decryption = new HashMap<String, String>();
		
		decryption.put("AA", "P");
		decryption.put("AD", "H");
		decryption.put("AF", "0");
		decryption.put("AG", "Q");
		decryption.put("AV", "G");
		decryption.put("AX", "6");
		
		decryption.put("DA", "4");
		decryption.put("DD", "M");
		decryption.put("DF", "E");
		decryption.put("DG", "A");
		decryption.put("DV", "1");
		decryption.put("DX", "Y");
		
		decryption.put("FA", "L");
		decryption.put("FD", "2");
		decryption.put("FF", "N");
		decryption.put("FG", "O");
		decryption.put("FV", "F");
		decryption.put("FX", "D");
		
		decryption.put("GA", "X");
		decryption.put("GD", "K");
		decryption.put("GF", "R");
		decryption.put("GG", "3");
		decryption.put("GV", "C");
		decryption.put("GX", "V");
		
		decryption.put("VA", "S");
		decryption.put("VD", "5");
		decryption.put("VF", "Z");
		decryption.put("VG", "W");
		decryption.put("VV", "7");
		decryption.put("VX", "B");
		
		decryption.put("XA", "J");
		decryption.put("XD", "9");
		decryption.put("XF", "U");
		decryption.put("XG", "T");
		decryption.put("XV", "I");
		decryption.put("XX", "8");
		
		decryption.put("PA", ".");
		decryption.put("PD", ",");
		decryption.put("PF", "‰");
		decryption.put("PG", "Ã");
		decryption.put("PV", "-");
		decryption.put("PX", ":");
		
		decryption.put("BA", "[");
		decryption.put("BD", "]");
		decryption.put("BF", "(");
		decryption.put("BG", ")");
		decryption.put("BV", ";");
		decryption.put("BX", "'");
		
		decryption.put("CA","_");
		decryption.put("CD","\"");
		decryption.put("CF","?");
		decryption.put("CG","!");
		decryption.put("CV","*");
		decryption.put("CX","'");
		
		decryption.put("EA", "=");
		decryption.put("ED", "/");
		decryption.put("EF", "^");
		decryption.put("EG", "~");
		decryption.put("EV", ">");
		decryption.put("EX", "<");	
		
		BufferedReader br = new BufferedReader(new FileReader("Enc.txt"));
		
	    File file = new File("Decrypt.txt");
	    file.createNewFile();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		String line=null;	
		
		while((line = br.readLine()) != null)
		{
			int i;
			String[] words = line.split(" ");
			//O(n)
			for(i=0; i < words.length; i++)
			{
				String word = words[i];
				writer.write(decryption.get(word));

			}							
		}//while
		System.out.println();
		System.out.println("Decrypted file successfully");
		
		br.close();
		writer.flush();
		writer.close();
		System.out.println("Running time (ms): " + (System.currentTimeMillis() - startTime) + " (Decryption)");
		//800ms

	}//Decrypt
}