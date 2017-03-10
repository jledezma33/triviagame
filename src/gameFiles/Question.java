package gameFiles;

public class Question{
	String question;
	String correctAnswer;
	String[] wrongAnswers = new String[3];
	
	public Question(String ques, String correct, String[] incorrect){
		question = ques;
		correctAnswer = correct;
		wrongAnswers = incorrect;
	}
}
