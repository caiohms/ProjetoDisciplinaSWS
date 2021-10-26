package com.pucpr.projetoDisciplina.domain.config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().antMatchers(HttpMethod.POST, "/login")
                .permitAll().antMatchers("/api/*").authenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // cria uma conta default
        auth.inMemoryAuthentication().withUser("servico").password("{noop}servico").roles("ADMIN");
    }

}
