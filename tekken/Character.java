package tekken;

import java.util.Random;
import java.util.Scanner;

abstract class Characters{
	abstract void jin();
	abstract void kazuya();
	abstract void king();
}

public class Character extends Characters{
	
	//class variables
	String name;
	String[] chr = {"1.Jin Kazama","2.Kazuya Mishima","3.King"};
	
	//objects
	Scanner sc = new Scanner(System.in);
	static Round r1 = new Round();
	Random rand = new Random();
	
	//methods
	//Lists/Shows options to Select your Character
	void chrOptions() {
		System.out.println("Select Your Character : ");
		for(String e:chr) System.out.println(e);
	}
	
	//Selects the Character
	void chrSelect() {
		System.out.print("Enter Character No: ");
		byte opt = sc.nextByte();
		switch(opt) {
		case 1:
			jin();
			break;
		case 2:
			kazuya();
			break;
		case 3:
			king();
			break;
		default:
			System.out.println("This Character Dose not Exist");
		}
	}
	
	//Character Names without Numbers
	String[] ChrName = {"Jin Kazama","Kazuya Mishima","King"}; 
	int randChr = rand.nextInt(ChrName.length);
	
	@Override
	void jin() {
		System.out.println();
		System.out.println("You Have Selected Jin Kazama");
		r1.Round1(ChrName[0],ChrName[randChr]);
	}
	
	@Override
	void kazuya() {
		System.out.println();
		System.out.println("You Have Selected Kazuya Mishima");
		r1.Round1(ChrName[1],ChrName[randChr]);
	}
	
	@Override
	void king() {
		System.out.println();
		System.out.println("You have Selected King");
		r1.Round1(ChrName[2],ChrName[randChr]);
	}
}
