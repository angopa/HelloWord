/**
 *  Create by Andres Gonzalez 2017/10/18
 */
public class MethodOverloading {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println(newScore);
		calculateScore(75);
		calculateScore();
		
	}
	
	public static int calculateScore(final String playerName, final int score) {
		System.out.println("Player" + playerName + "score: " + score + "points");
		return score * 1000;
	}
	
	public static int calculateScore(final int score) {
		System.out.println("Unamed player score: " + score + "points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}
	
}
