package com.pucpr.projetoDisciplina.domain.dtos;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class Login {

    private final String username;

    private final String password;

    public Login(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public UsernamePasswordAuthenticationToken convert() {
        return new UsernamePasswordAuthenticationToken(getUsername(), getPassword());
    }
}
