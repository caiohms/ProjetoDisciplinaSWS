package com.pucpr.projetoDisciplina.domain.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

    @Value("${projetoDisciplina.jwt.expiration}")
    private String expiration;

    @Value("${projetoDisciplina.jwt.secret}")
    private String secret;

    /**
     * 
     * @param authentication
     * @return retorna o jwt para mandar para o client-side
     */
    public String gerarToken(Authentication authentication, String username) {

        return Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(expiration)))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }
}
