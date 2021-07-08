package simplon.com.mcq.domain.dtos;

public class QuestionPropositionView {
    public QuestionPropositionView() {
	super();

    }

    private String textQuestion;
    private int difficultyLevel;

    public String getTextQuestion() {
	return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
	this.textQuestion = textQuestion;
    }

    public int getDifficultyLevel() {
	return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
	this.difficultyLevel = difficultyLevel;
    }

}
