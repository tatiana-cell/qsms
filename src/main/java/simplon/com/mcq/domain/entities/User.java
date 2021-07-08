package simplon.com.mcq.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "user_password")
    private String password;

    @Column(name = "is_tutor")
    private boolean tutor;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @JoinColumn(name = "role_id")
    @ManyToOne
    private Role role;

    public User() {
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public boolean isTutor() {
	return tutor;
    }

    public void setTutor(boolean tutor) {
	this.tutor = tutor;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public LocalDateTime getCreationDate() {
	return creationDate;
    }

    public void setCreationDate(LocalDateTime localDateTime) {
	this.creationDate = localDateTime;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

    @Override
    public String toString() {
	return "User [firstName=" + firstName + ", lastName=" + lastName + ", pseudo=" + pseudo + ", tutor=" + tutor
		+ ", password=PROTECTED, username=" + username + "]";
    }
}
