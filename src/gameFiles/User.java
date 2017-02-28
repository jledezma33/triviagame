package gameFiles;

public class User {
	public String userName;
	public String password;
	public int score;
	
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
		return String.format("%12s%20s%9.2f", userName, password, score);
	}
	
	public void deserialize(String raw){
		this.userName = raw.substring(0, 12).trim();
		this.password = raw.substring(12, 32).trim();
		String rawScore = raw.substring(32).trim();
		this.score = Integer.parseInt(rawScore);
	}
}
