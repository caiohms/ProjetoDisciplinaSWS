package com.pucpr.projetodisciplina.domain.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pucpr.projetodisciplina.domain.dtos.LoginDto;
import com.pucpr.projetodisciplina.domain.services.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    protected JWTLoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException {

        LoginDto userLogin = new ObjectMapper()
                .readValue(request.getInputStream(), LoginDto.class);

        return getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        userLogin.getUsername(),
                        userLogin.getPassword(),
                        Collections.emptyList()
                ));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain filterChain, Authentication auth) {

        TokenService.addAuthentication(response, auth.getName());
    }

}