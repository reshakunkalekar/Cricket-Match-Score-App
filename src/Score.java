
public class Score {
	
	private CricketMatchScore match;
	private int totalScore=0;

	public Score(CricketMatchScore mh) {
		match = mh;
	}

	public void addingScore(int score) {
		if (score <= 6 && score >= 0)
			totalScore += match.addingScore(score);
	}
	
	public int getCurrentScore(){
		return totalScore;
	}
	
	//gets score in overs
	public int getScoresInOver(int over){
		
		Over ovr = match.getOverAt(over);
		
		int scr = 0;
		for(int i=0; i<ovr.getCurrentBall();i++){
			scr += ovr.getScoreAtBall(i);
		}
		return scr;
	}
	
	//gets total score
	public int getTotalScore(){
		return totalScore;
	}
	
	public void DisplayScoreBoard() {
		Debuger.Log(" -- " + match.getTeam1() + " VS " + match.getTeam2() + " -- ");
		Debuger.Log("Batting : " + match.getTeam1());
		Debuger.Log("Current Score : " + totalScore);
		Debuger.Log("Current Over : " + (match.getCurrentOver() + 1));
		DisplayScorePerOver();
		Debuger.Log("Current Over Ball : " + (match.getCurrentOverBall()));
		Debuger.Log("Total Score : " + totalScore);
	}

	public void DisplayScorePerOver() {
		int s=0;
		for (int i = 0; i < match.getCurrentOver(); i++) {
			if(match.getOverAt(i).getCurrentBall() > 0){
				Debuger.Log("Over "+(i+1)+" : ");
				s=0;
				for (int j = 0; j < match.getOverAt(i).getCurrentBall(); j++) {
					s+=match.getOverAt(i).getScoreAtBall(j);
					Debuger.Log(" "+match.getOverAt(i).getScoreAtBall(j));
				}
				Debuger.Log(" = "+s);
			}
		}
	}
	
}
