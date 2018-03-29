import static org.junit.Assert.*;

import org.junit.Test;

public class CurrentOverTest {

	CricketMatchScore matchScr;
	Score score;
	
	@Test
	public void test() {
		matchScr = new CricketMatchScore("IND","PAK",6);
		score = new Score(matchScr);
		score.addingScore(1);
		score.addingScore(0);
		score.addingScore(2);
		score.addingScore(3);
		score.addingScore(1);
		score.addingScore(3);
		
		score.addingScore(2);
		score.addingScore(2);
		assertEquals(2, matchScr.getCurrentOver()+1);
	}

}