package gameFiles;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogIn {
	
	private static User user;
	
	public static boolean userSignUp(String username, String password, String confirmPassword) throws IOException{
		   UserDataFile file = new UserDataFile();
		   User user = new User(username, password, 0);
		   boolean successfulSignUp = false;
		   Pattern usernamePattern = Pattern.compile("^[A-z0-9]{1,15}$");
		   Pattern passwordPattern = Pattern.compile("^(?=.*[A-z])(?=.*\\d)[A-z\\d]{1,12}$");
		   Matcher usernameMatcher = usernamePattern.matcher(username);
		   Matcher passwordMatcher = passwordPattern.matcher(password);
		   if(password.equals(confirmPassword) && usernameMatcher.matches() && passwordMatcher.matches()){
			   successfulSignUp =  true;
			   file.save(user);
		   }
		   
		   return successfulSignUp;
	   }
	
	public static boolean userLogIn(String username, String password) throws IOException{
		UserDataFile file = new UserDataFile();
		user = file.load(username);
		boolean successfulLoad = false;
		if(user != null){
			successfulLoad = true;
		}
		return successfulLoad;
	}

	public static User getUser() {
		return user;
	}
	
}
