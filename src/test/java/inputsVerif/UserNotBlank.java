package inputsVerif;

import javax.validation.constraints.NotBlank;

public class UserNotBlank {
    @NotBlank(message = "Préom est obligatoire")
    private String firstName;

    public UserNotBlank() {

    }

    @Override
    public String toString() {
	return "UserNotBlank [firstName=" + firstName + "]";
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

}
