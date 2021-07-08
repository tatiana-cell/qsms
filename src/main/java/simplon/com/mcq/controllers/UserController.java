package simplon.com.mcq.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserLogin;
import simplon.com.mcq.security.IdToken;
import simplon.com.mcq.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/add")
    public void testCreateUser(@Valid @RequestBody UserCreate inputs) {
	service.create(inputs);
    }

    /*
     * @PostMapping("/login") public void CreateUserLogin(@RequestBody
     * UserCreateLogin inputs) { service.CreateUserLogin(inputs); }
     */

    @PostMapping("/login")
    public IdToken login(@Valid @RequestBody UserLogin inputs) {
	// service.login(inputs);
	return service.login(inputs);
    }

    @GetMapping("/")
    public String testCnx() {
	return "Connexion est reussie!";
    }

}
