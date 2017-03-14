package gameFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz {
//	private static String quiz;
	private static Pattern questionPattern = Pattern.compile("\"question\":(?>\"([^\"]+)\")");
	private static Pattern correctAnswerPattern = Pattern.compile("\"correct_answer\":(?>\"([^\"]+)\")");
	private static Pattern incorrectAnswersPattern = Pattern.compile("\"incorrect_answers\":\\[(?>\"([^\"]+)\",\"([^\"]+)\",\"([^\"]+)\")");
	private static Matcher questionMatcher;
	private static Matcher correctAnswerMatcher;
	private static Matcher incorrectAnswersMatcher;
	public static Question[] getQuestions(URL url) throws Exception{
//		URL quizURL = new URL("https://opentdb.com/api.php?amount=10&type=multiple");
		URLConnection connection = url.openConnection();
		BufferedReader readIn =  new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String quiz = readIn.readLine();
		readIn.close(); 
		System.out.println(quiz);
		questionMatcher = questionPattern.matcher(quiz);
		correctAnswerMatcher = correctAnswerPattern.matcher(quiz);
		incorrectAnswersMatcher = incorrectAnswersPattern.matcher(quiz);

//		Pattern questionPattern = Pattern.compile("\"question\":(?>\"([^\"]+)\")");
//		Pattern correctAnswerPattern = Pattern.compile("\"correct_answer\":(?>\"([^\"]+)\")");
//		Pattern incorrectAnswersPattern = Pattern.compile("\"incorrect_answers\":\\[(?>\"([^\"]+)\",\"([^\"]+)\",\"([^\"]+)\")");
//		Matcher questionMatcher = questionPattern.matcher(quiz);
//		Matcher correctAnswerMatcher = correctAnswerPattern.matcher(quiz);
//		Matcher incorrectAnswersMatcher = incorrectAnswersPattern.matcher(quiz);
		Question[] questionArray = new Question[10];
		Arrays.asList(questionArray).stream().forEach(s -> s = getQustionVals());
//		for(int i = 0; i < questionArray.length; i++){
//			
//		}
		return questionArray;
	}
	
	public static Question getQustionVals(){
		questionMatcher.find();
		String question = questionMatcher.group(1);
		correctAnswerMatcher.find();
		String correctAnswer = correctAnswerMatcher.group(1);
		String[] incorrectAnswers = new String[3];
		incorrectAnswersMatcher.find();
		incorrectAnswers[0] =  incorrectAnswersMatcher.group(1);	   
		incorrectAnswers[1] =  incorrectAnswersMatcher.group(2);	  
		incorrectAnswers[2] =  incorrectAnswersMatcher.group(3);	  
		return new Question(question, correctAnswer, incorrectAnswers);

	}
}
