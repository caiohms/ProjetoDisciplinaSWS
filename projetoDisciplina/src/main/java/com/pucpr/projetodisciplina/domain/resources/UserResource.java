package com.pucpr.projetodisciplina.domain.resources;

import com.pucpr.projetodisciplina.domain.dtos.LoginDto;
import com.pucpr.projetodisciplina.domain.entities.User;
import com.pucpr.projetodisciplina.domain.services.TokenService;
import com.pucpr.projetodisciplina.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final UserService userService;

    @Autowired
    private TokenService tokenService;

    public UserResource(UserService userService, TokenService tokenService) {
        this.userService = userService;
        this.tokenService = tokenService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LoginDto registerDto) {
        try {
            User user = userService.saveUser(registerDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
