package simplon.com.mcq.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question extends AbstractEntity {

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "difficulty_level")
    private int difficultyLevel;

    @Column(name = "question_date")
    private LocalDateTime questionDate;

    @JoinColumn(name = "qcm_id")
    @ManyToOne
    private Qcm qcm;

    public int getDifficultyLevel() {
	return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
	this.difficultyLevel = difficultyLevel;
    }

    public LocalDateTime getQuestionDate() {
	return questionDate;
    }

    public void setQuestionDate(LocalDateTime questionDate) {
	this.questionDate = questionDate;
    }

    public Question() {

    }

    public String getQuestionText() {
	return questionText;
    }

    public void setQuestionText(String questionText) {
	this.questionText = questionText;
    }

    // entity.setCreationDate(LocalDateTime.now());

}
