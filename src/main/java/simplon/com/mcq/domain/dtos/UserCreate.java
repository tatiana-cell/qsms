package simplon.com.mcq.domain.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import simplon.com.mcq.validations.UniqueUsername;
import simplon.com.mcq.validations.ValidPassword;

public class UserCreate {
    @NotBlank(message = "Prénom est obligatoire!")
    @Size(max = 255)
    private String firstName;

    @NotBlank(message = "Nom est obligatoire!")
    @Size(max = 255)
    private String lastName;

    @Size(min = 3, max = 20)
    private String pseudo;

    @NotBlank(message = "Email adresse est obligatoire!")
    @Size(max = 255)
    @Email
    @UniqueUsername
    private String username;

    @NotBlank
    @ValidPassword
    private String password;

    private boolean tutor;

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

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public boolean isTutor() {
	return tutor;
    }

    public void setTutor(boolean tutor) {
	this.tutor = tutor;
    }

    public UserCreate() {
    }

    @Override
    public String toString() {
	return "UserCreate [firstName=" + firstName + ", lastName=" + lastName + ", pseudo=" + pseudo + ", userName="
		+ username + ", password=" + password + ", tutor=" + tutor + "]";
    }

}
