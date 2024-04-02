package com.bridgelabz.bookstore.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class AppConfig {
    @Bean

    public BCryptPasswordEncoder bCryptPasswordEncoder()
    {
        return  new BCryptPasswordEncoder();
    }
}
