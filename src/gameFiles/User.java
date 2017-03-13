package gameFiles;

public class User {
	public String userName;
	public String password;
	private int score = 0;
	
	public User(){};
	
	public User(String u, String p, int s){
		this.userName = u;
		this.password = p;
		this.score = s;
	}
	
	@Override
	public int hashCode(){
		return userName.hashCode();
	}
	
	public String serialize(){
		return String.format("%15s%12s%2d", userName, password, score);
	}
	
	public void deserialize(String raw){
		this.userName = raw.substring(0, 15).trim();
		this.password = raw.substring(15, 27).trim();
		String rawScore = raw.substring(27).trim();
		this.score = Integer.parseInt(rawScore);
	}
	
	public void checkScore(int current){
		if (current > score) {
			score = current;
		}
	}

	public int getScore() {
		return score;
	}
}
