//Mark McMurtury
//Setpember 9 2019

import java.util.*;
import java.io.*;


/* This code will read in the values from the various text files, 
 * storing them into a list. From there it will randomly select 
 * elements from the lists to generate an NPC that it will display.
 *
*/
public class npcGenerator {
	//These lists will hold the tables for the npcGenerator.
	private List<String>[] appearance;
	private List<String>[] highAbility;
	private List<String>[] lowAbility;
	private List<String>[] talents;
	private List<String>[] mannerisms;
	private List<String>[] traits;
	private List<String>[] bonds;
	private List<String>[] flawsSecrets;
	private ArrayList<String>[] ideals;
	
	public npcGenerator(){
		
	}
	//This will read in the files which will fill the lists.
	public void ReadDataIn(String filename, List a){
		
		if (fileName == null)
			return;
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				a.add(fileLine);
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//This will read in the files for the ideals since they are handled differently.
	public void ReadIdeals(String filename, int ideal){
		
		if (fileName == null)
			return;
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				this.ideals[ideal].add(fileLine);
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//This is where the code is ran.
	public static void main(String args[]){
		//TODO
	}
}