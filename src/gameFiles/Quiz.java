package gameFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Quiz {
	public static void main(String[] args) throws Exception{
		   URL quiz = new URL("https://www.opentdb.com/api.php?amount=10&type=multiple");
		   URLConnection connection = quiz.openConnection();
		   BufferedReader readIn =  new BufferedReader(new InputStreamReader(connection.getInputStream()));
		   String line;
		   while((line = readIn.readLine()) != null){
			   System.out.println(line);
		   }
		   readIn.close();  
	   }
}
