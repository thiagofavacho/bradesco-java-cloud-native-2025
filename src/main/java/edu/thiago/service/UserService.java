package edu.thiago.service;

import edu.thiago.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
