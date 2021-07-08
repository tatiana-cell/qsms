package simplon.com.mcq.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserCreateLogin;
import simplon.com.mcq.domain.dtos.UserLogin;
import simplon.com.mcq.domain.entities.Role;
import simplon.com.mcq.domain.entities.User;
import simplon.com.mcq.repositories.RoleRepository;
import simplon.com.mcq.repositories.UserRepository;
import simplon.com.mcq.security.IdToken;
import simplon.com.mcq.security.TokenProvider;

@Service
public class UserServiceImpl implements UserService {
    private final PasswordEncoder encoder;
    private final TokenProvider tokenProvider;
    private final UserRepository users;
    private final RoleRepository roles;

    public UserServiceImpl(UserRepository users, RoleRepository roles, PasswordEncoder encoder,
	    TokenProvider tokenProvider) {
	this.users = users;
	this.roles = roles;
	this.encoder = encoder;
	this.tokenProvider = tokenProvider;
    }

    @Override
    public void create(UserCreate inputs) {
	User entity = new User();
	entity.setUsername(inputs.getUsername());
	entity.setFirstName(inputs.getFirstName());
	entity.setLastName(inputs.getLastName());
	String raw = inputs.getPassword();
	String encoded = encoder.encode(raw);
	entity.setPassword(encoded);
	entity.setPseudo(inputs.getPseudo());
	entity.setTutor(inputs.isTutor());
	entity.setCreationDate(LocalDateTime.now());
	Role defaultRole = roles.findByByDefaultTrue();
	entity.setRole(defaultRole);
	users.save(entity);
    }

    @Override
    public IdToken login(UserLogin inputs) {
	String username = inputs.getUsername();
	User entity = users.findByUsername(username)
		.orElseThrow(() -> new BadCredentialsException("username not found:" + username));

	List<String> authorities = List.of(entity.getRole().getRoleName());

	IdToken token = tokenProvider.idToken(username, authorities);
	return token;
    }

    @Override
    public void CreateUserLogin(UserCreateLogin inputs) {
	// TODO Auto-generated method stub

	User user = new User();
	user.setUsername(inputs.getUsername());
	user.setPassword(encoder.encode(inputs.getPassword()));

	users.save(user);
    }

}
