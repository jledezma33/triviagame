package gameFiles;

import java.net.MalformedURLException;
import java.net.URL;

public class Options {
	
	public static URL generateURL(String category, String difficulty) throws MalformedURLException{
		String categoryCode = "";
		String difficultySetting = "";
		switch(category){
		case "Anime":
			categoryCode = "31";
			break;
		case "Video Games":
			categoryCode = "15";
			break;
		case "Movies":
			categoryCode = "11";
			break;
		case "Mythology":
			categoryCode = "20";
			break;
		case "Live Theater":
			categoryCode = "13";
			break;
		}
		switch(difficulty){
		case "Easy":
			difficulty = "easy";
			break;
		case "Medium":
			difficulty = "medium";
			break;
		case "Hard":
			difficulty = "hard";
			break;
		}
		String url = "https://opentdb.com/api.php?amount=10&category=" + categoryCode + "&difficulty=" + difficultySetting + "&type=multiple";
		URL quizURL = new URL(url);
		return quizURL;
	}
}
