package simplon.com.mcq.domain.dtos;

import javax.validation.constraints.NotBlank;

public class UserLogin {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public UserLogin() {
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

    @Override
    public String toString() {
	return "UserLogin [username=" + username + ", password=" + password + "]";
    }

}
