/** Program: DefensivePlayer
* File: DensivePlayer.java 
* Summary: Extension class of the abstract class and adds tackles 
* Author: Lyric Payton
* Date: October 11, 2018
**/
public class DefensivePlayer extends Player {
private int tackles;

public DefensivePlayer () {
	super();
	tackles = 0;

}

public DefensivePlayer(String name, int number, String team, int height, int weight, String position, int wins,
		int loses, String conference, int netpoints, int tackles) {
	super(name, number, team, height, weight, position, wins, loses, conference, netpoints);	
}

public int getTackles() {
	return tackles;
}

public void setTackles(int tackles) {
	this.tackles = tackles;
}
public String toString() {
	return super.toString() + ", tackles: " + tackles;
}

}
