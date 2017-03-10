package gameFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Quiz {
	public static void test() throws Exception{
		   URL quizURL = new URL("https://www.opentdb.com/api.php?amount=10");
		   URLConnection connection = quizURL.openConnection();
		   BufferedReader readIn =  new BufferedReader(new InputStreamReader(connection.getInputStream()));
		   String quiz = readIn.readLine();
		   Gson gson = new Gson();
		   JsonArray jsonArray = new JsonParser().parse(quiz).getAsJsonArray();
	        for (int i = 0; i < jsonArray.size(); i++) {
	            JsonElement str = jsonArray.get(i);
	            Question obj = gson.fromJson(str, Question.class);
	            System.out.println(obj);
	            System.out.println(str);
	            System.out.println("-------");
		}
		   readIn.close();  
	   }
}
