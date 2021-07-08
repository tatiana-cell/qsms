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
@RequestMapping("/api")
public class TestController {

    private final UserService service;

    public TestController(UserService service) {
	this.service = service;
    }

    @PostMapping("/users")
    public void testCreateUser(@RequestBody UserCreate inputs) {
	service.create(inputs);
    }

    @PostMapping("/users/login")
    public IdToken login(@Valid @RequestBody UserLogin inputs) {
	service.login(inputs);
	return service.login(inputs);
    }

    @GetMapping("/testCnx")
    public String testCnx() {
	return "Connexion est reussie!";
    }

    @GetMapping("/test5")
    public String testCnx2() {
	return "Connexion est reussie!";
    }

    @GetMapping("/test6")
    public String testCnx6() {
	return "Connexion6 est reussie!";
    }

}
