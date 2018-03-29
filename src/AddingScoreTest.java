import static org.junit.Assert.*;

import org.junit.Test;

public class AddingScoreTest {

	CricketMatchScore matchScr;
	Score score;
	
	@Test
	public void test() {
		matchScr = new CricketMatchScore("IND","PAK",6);
		score = new Score(matchScr);
		score.addingScore(2);
		score.addingScore(3);
		//score.addingScore(4);
		assertEquals(3, score.getCurrentScore());
	}

	public void test2Fail() {
		matchScr = new CricketMatchScore("IND","PAK",6);
		score = new Score(matchScr);
		score.addingScore(1);
		score.addingScore(2);
		score.addingScore(2);
		assertEquals(3, score.getCurrentScore());
	}
}