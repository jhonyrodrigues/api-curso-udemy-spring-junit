package br.com.udemy.api.services;

import br.com.udemy.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
