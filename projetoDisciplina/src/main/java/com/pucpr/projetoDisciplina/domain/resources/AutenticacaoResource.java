package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.services.TokenService;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = { "/login", "/auth" })
public class AutenticacaoResource {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;
}
