import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreBallTest {

	CricketMatchScore matchScr;
	Score score;
	
	@Test
	public void test() {
		matchScr = new CricketMatchScore("IND","PAK",6);
		score = new Score(matchScr);
		score.addingScore(1);
		score.addingScore(2);
		assertEquals(2, score.getCurrentScore());
	}

}