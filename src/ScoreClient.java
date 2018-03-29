
public class ScoreClient {

	public static void main(String[] args) {
		
		CricketMatchScore matchScr = new CricketMatchScore("IND","PAK",6);
		Score score = new Score(matchScr);
		
		score.addingScore(1);
		score.addingScore(2);
		score.addingScore(3);
		score.addingScore(0);
		score.addingScore(3);
		score.addingScore(2);

		score.addingScore(1);
		score.addingScore(4);
		score.addingScore(0);
		score.addingScore(1);
		score.addingScore(3);
		score.addingScore(3);

		
		
		score.DisplayScoreBoard();
	}

}