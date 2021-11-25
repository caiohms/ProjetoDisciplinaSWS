package com.pucpr.projetodisciplina.domain.services;

import com.pucpr.projetodisciplina.domain.dtos.LoginDto;
import com.pucpr.projetodisciplina.domain.entities.User;
import com.pucpr.projetodisciplina.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(LoginDto register) {
        User user = register.convertRegister();
        userRepository.save(user);
        return user;
    }

    public Optional<User> findUser(String username) {
        return userRepository.findByUsername(username);
    }
}
