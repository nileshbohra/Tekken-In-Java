package tekken;

import java.util.Scanner;

abstract class GameModes{
	abstract void StoryMode();
	abstract void ArcadeMode();
	abstract void SurvivalMode();
	abstract void Settings();
}

public class MainScreen extends GameModes {
	//objects
	Scanner sc = new Scanner(System.in);
	Character chr = new Character();
	
	//Class Variables
	String Gamename = "Tekken 6";
	String[] GameMode = {"1.Story Mode","2.Arcade Mode","3.Survival Mode","4.Settings"};
	
	//methods
	
	//starting the Game
	void start() {
		System.out.println(".....* "+Gamename+" *.....");
	}
	
	//List of Game Modes
	void GameModes() {
		System.out.println("Game Modes");
		for(String e:GameMode) System.out.println(e);
	}
	void ModeSelect() {
		System.out.print("Enter no to select GameMode : ");
		byte sel = sc.nextByte();
		
		switch(sel) {
		case 1: 
			StoryMode();
			break;
		case 2:
			ArcadeMode();
			break;
		case 3:
			SurvivalMode();
			break;
		case 4:
			Settings();
			break;
		default:
			System.out.println("This GameMode Does Not Exist");
		}
	}
	
	@Override
	void StoryMode() {
		System.out.println();
		System.out.println("Story Mode Begins");
		chr.chrOptions();
		chr.chrSelect();
	}
	@Override
	void ArcadeMode() {
		System.out.println();
		System.out.println("Arcade Mode Begins");
		chr.chrOptions();
		chr.chrSelect();
	}
	@Override
	void SurvivalMode() {
		System.out.println();
		System.out.println("Survival Mode Begins");
		chr.chrOptions();
		chr.chrSelect();
	}
	@Override
	void Settings() {
		System.out.println();
		System.out.println("Settings is Under Construction");
	}
}