package gameFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz {
	public static void test() throws Exception{
		URL quizURL = new URL("https://opentdb.com/api.php?amount=10&type=multiple");
		URLConnection connection = quizURL.openConnection();
		BufferedReader readIn =  new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String quiz = readIn.readLine();
		readIn.close(); 
		System.out.println(quiz);
		Pattern questionPattern = Pattern.compile("\"question\":(?>\"([^\"]+)\")");
		Pattern correctAnswerPattern = Pattern.compile("\"correct_answer\":(?>\"([^\"]+)\")");
		Pattern incorrectAnswersPattern = Pattern.compile("\"incorrect_answers\":\\[(?>\"([^\"]+)\",\"([^\"]+)\",\"([^\"]+)\")");
		Matcher questionMatcher = questionPattern.matcher(quiz);
		Matcher correctAnswerMatcher = correctAnswerPattern.matcher(quiz);
		Matcher incorrectAnswersMatcher = incorrectAnswersPattern.matcher(quiz);
		Question[] questionArray = new Question[10];
		for(int i = 0; i < questionArray.length; i++){
			questionMatcher.find();
			System.out.println(i);
			String question = questionMatcher.group(1);
			correctAnswerMatcher.find();
			String correctAnswer = correctAnswerMatcher.group(1);
			String[] incorrectAnswers = new String[3];
			incorrectAnswersMatcher.find();
			incorrectAnswers[0] =  incorrectAnswersMatcher.group(1);	   
			incorrectAnswers[1] =  incorrectAnswersMatcher.group(2);	  
			incorrectAnswers[2] =  incorrectAnswersMatcher.group(3);	  
			questionArray[i] = new Question(question, correctAnswer, incorrectAnswers);
		}
		for(int k = 0; k < questionArray.length; k ++){
			System.out.println(questionArray[k]);
		}
	}
}
