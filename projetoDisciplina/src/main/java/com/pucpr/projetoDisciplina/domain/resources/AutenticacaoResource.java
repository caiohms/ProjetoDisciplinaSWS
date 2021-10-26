package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.dtos.Login;
import com.pucpr.projetoDisciplina.domain.services.TokenService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = { "/login", "/auth" })
public class AutenticacaoResource {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticar(@RequestBody Login login) {
        UsernamePasswordAuthenticationToken loginAuth = login.convert();

        try {
            Authentication authentication = authManager.authenticate(loginAuth);

            System.out.println(authentication.getPrincipal());
            String token = "TOKEN";
            return ResponseEntity.ok().header("Authorization", token).build();
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
