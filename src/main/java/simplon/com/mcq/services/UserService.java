package simplon.com.mcq.services;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserCreateLogin;
import simplon.com.mcq.domain.dtos.UserLogin;
import simplon.com.mcq.security.IdToken;

public interface UserService {
    void create(UserCreate inputs);

    IdToken login(UserLogin inputs);

    void CreateUserLogin(UserCreateLogin inputs);
}
