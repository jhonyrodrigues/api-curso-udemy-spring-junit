package br.com.udemy.api.services;

import br.com.udemy.api.domain.User;
import br.com.udemy.api.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    User create(UserDto obj);
}
