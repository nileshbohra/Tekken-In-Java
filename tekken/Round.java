package tekken;

import java.util.Scanner;

//Abstract class Stats Shows Stats of all characters
abstract class Stats {
	int health = 100;
	int punch = 20;
	int kick = 40;
}

//Shows Actions a Player can Command to a Character
abstract class CharacterActions extends Stats {
	abstract void punch(String player);

	abstract void kick(String player);
	
	abstract void taunt(String Player);
}

public class Round {
	// objects
	Character chr = new Character();
	Fight fight = new Fight();

	// methods
	void Round1(String PlayChr, String RandChr) {
		System.out.println("*** Round 1 ***");
		System.out.println(PlayChr + " V/s " + RandChr);
		System.out.println("!!! FIGHT !!!");

		fight.fightOptions(PlayChr);
	}
}

class Fight extends CharacterActions {
	// objects
	Character cs = new Character();
	Scanner sc = new Scanner(System.in);

	// methods
	void fightOptions(String Player) {
		int n = 0;
		while (health > 0) {
			System.out.print("Enter" + "\n1.punch" + "\n2.kick" +"\n3.Taunt");
			System.out.println();
			n = sc.nextInt();

			switch (n) {
			case 1:
				punch(Player);
				break;
			case 2:
				kick(Player);
				break;
			case 3:
				taunt(Player);
				break;
			default:
				System.out.println("Wrong Input");
			}
		}
	}

	// Punch
	@Override
	void punch(String Player) {
		// form Stats abstract class
		health = health-punch;
		if (health <= 0) {
			System.out.println("Game Over"+"\n"+Player+" WINS");
		} else {
			System.out.println(Player + " Punched" + "\nhealth: " + health);
		}
	}
	
	// kick
	@Override
	void kick(String Player) {
		health = health - kick;
		if (health <= 0) {
			System.out.println("Game Over"+"\n"+Player+" WINS");
		} else {
			System.out.println(Player + " Kicked" + "\nhealth: " + health);
		}
	}
	
	//Taunt
	@Override
	void taunt(String Player) {
		System.out.println(Player+" is Taunting");
	}
}