package simplon.com.mcq.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qcm")
public class Qcm extends AbstractEntity {
    @Column(name = "qcm_name")
    private String qcmName;
    @Column(name = "qcm_creation_date")
    private LocalDateTime qcmCreationDate;

    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    public Qcm() {
    }

    public String getQcmName() {
	return qcmName;
    }

    public Category getCategory() {
	return category;
    }

    public void setCategory(Category category) {
	this.category = category;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public void setQcmName(String qcmName) {
	this.qcmName = qcmName;
    }

    public LocalDateTime getQcmCreationDate() {
	return qcmCreationDate;
    }

    public void setQcmCreationDate(LocalDateTime qcmCreationDate) {
	this.qcmCreationDate = qcmCreationDate;
    }

}
