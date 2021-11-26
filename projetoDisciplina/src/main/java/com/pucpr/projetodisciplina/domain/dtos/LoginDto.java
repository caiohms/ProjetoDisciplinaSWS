package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.User;
import com.pucpr.projetodisciplina.domain.repositories.UserRepository;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.Optional;

public class LoginDto {

    private String username;

    private String password;

    public LoginDto() {
    }

    public LoginDto(User user) {
        this.username = user.getUsername();
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

    public UsernamePasswordAuthenticationToken convert() {
        return new UsernamePasswordAuthenticationToken(getUsername(), getPassword());
    }

    public User convertRegister(UserRepository userRepository) throws Exception {
        Optional<User> optionalUser = userRepository.findByUsername(getUsername());
        if (optionalUser.isEmpty()) {
            return new User(getUsername(), getPassword());
        } else {
            throw new Exception("User already exists");
        }
    }
}
