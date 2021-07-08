package simplon.com.mcq.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class BadCredentialsException extends RuntimeException {// identifiants de mannere unique utilisateur
    public BadCredentialsException(String message) {
	super(message);
    }

}
