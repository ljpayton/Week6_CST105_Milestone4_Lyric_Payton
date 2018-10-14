/** Program: OffensivePlayer
* File: OffensivePlayer.java 
* Summary: Extension class of the abstract class and adds yards 
* Author: Lyric Payton
* Date: October 11, 2018
**/
public class OffensivePlayer extends Player{
private int yards;
//constructor 
public OffensivePlayer() {
	super();
	yards = 0;

}
public OffensivePlayer(String name, int number, String team, int height, int weight, String position, int wins,
		int loses, String conference, int netpoints, int yards) {
	super(name, number, team, height, weight, position, wins, loses, conference, netpoints);
	this.yards = yards;
}
public int getYards() {
	return yards;
}
public void setYards(int yards) {
	this.yards = yards;
}
public String toString() {
	return super.toString() + ", yards: " + yards;
}

}
