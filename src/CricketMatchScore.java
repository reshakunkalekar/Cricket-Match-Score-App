
public class CricketMatchScore {
	
	private String team1;
	private String team2;
	private int currentOver = 0;
	private int totalOvers = 0;
	
	
	private Over[] overs;
	
	
	public CricketMatchScore(String tm1, String tm2, int ovr) {
		team1 = tm1;
		team2 = tm2;
		totalOvers = ovr;
		overs = new Over[totalOvers];
	}
	
	
	//getters
	
	public int getOvers() {
		return totalOvers;
	}
	
	public Over getOverAt(int i) {
		return overs[i];
	}
	
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	
	//adding Score
	public int addingScore(int score){
		int scr=0;
		if(currentOver<totalOvers){
			overs[currentOver].addingScore(score);
			currentOver++;
			scr=score;
		}
		return scr;
	}
	
	public int getCurrentOver() {
		return currentOver;
	}
	
	public int getCurrentOverBall() {
		return overs[currentOver].getCurrentBall();
	}
}
