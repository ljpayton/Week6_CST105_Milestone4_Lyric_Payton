/** Program: Manager Class
* File: Manager.java 
* Summary: Component of the NFL final project that hold players attributes.
* Author: Lyric Payton
* Date: October 7, 2018
**/
import java.util.*; 

public class ManagerClass {
//should create array
	static ArrayList<Player> roster = new ArrayList<Player>();
	
	public static void main(String[] args) {   
	
		ManagerClass myManager = new ManagerClass(roster);
		System.out.println(myManager);  //Displays the list of players from the toString method	 
	}
	
	public ManagerClass(ArrayList<Player> myTeam) {  
		//Constructor of the PlayerManager
		createPlayers(); //calls the createPlayers method
		myTeam = roster;
	}
	
	private static void createPlayers() {  
		//hard players
		Player ryan = new OffensivePlayer("Allen Ryan", 6, "NE Patriots", 74, 220, "Punter", 3, 2, "AFC East", 26,9);
		roster.add(ryan);
		Player allen = new DefensivePlayer("Dewayne Allen",83,"NE Patriots", 75, 265,"TightEnd", 3, 2, "AFC East", 25,10);
		roster.add(allen);
		Player da = new DefensivePlayer("David Andrews", 60, "NE Patriots", 75, 300, "LineBacker", 3, 2, "AFC East", 23,11);
		roster.add(da);
		Player bb = new OffensivePlayer("Braxton Berrios", 51, "NE Patriots", 69, 190, "Wide Receiver", 3, 2, "AFC East", 21,4);
		roster.add(bb);
		Player tb = new OffensivePlayer("Tom Brday", 12, "NE Patriots", 76, 225, "Quarter Back", 3, 2, "AFC East", 17,6);
		roster.add(tb);
		Player bt = new DefensivePlayer("Trent Brown", 77, "NE Patriots", 80, 380, "Outside Tackle", 3, 2, "AFC East", 19,8);
		roster.add(bt);
	}

	public String toString() { 
		//the toString method
		String teamList = "";
		for(int i = 0; i< roster.size();i++)
		teamList += roster.get(i) + "\n"; // indents players
		return teamList;
	}

}