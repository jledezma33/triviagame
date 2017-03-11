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
	
	public String getQuestion(){
		return question;
	}
	
	public Question setQuestion(String question){
		this.question = question;
		return this;
	}
	
	public String getCorrectAnswer(){
		return correctAnswer;
	}
	
	public Question setCorrectAnswer(String correctAnswer){
		this.correctAnswer = correctAnswer;
		return this;
	}
	
	public String[] getWrongAnswers(){
		return wrongAnswers;
	}
	
	public Question setWrongAnswers(String[] wrongAnswers){
		this.wrongAnswers = wrongAnswers;
		return this;
	}
	
}
