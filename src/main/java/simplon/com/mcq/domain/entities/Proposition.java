package simplon.com.mcq.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "propositions")
public class Proposition extends AbstractEntity {

    @Column(name = "proposition_text")
    private String propositionText;

    @Column(name = "is_correct")
    private boolean isCorrect;

    public boolean isCorrect() {
	return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
	this.isCorrect = isCorrect;
    }

    public Proposition() {

    }

    public String getPropositionText() {
	return propositionText;
    }

    public void setPropositionText(String propositionText) {
	this.propositionText = propositionText;
    }

}
