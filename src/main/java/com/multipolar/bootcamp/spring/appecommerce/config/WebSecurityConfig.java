package com.multipolar.bootcamp.spring.appecommerce.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().disable()
                .authorizeRequests()
                .antMatchers(
                        "/swagger-ui.html",
                        "/swagger-resources/**",
                        "/v2/api-docs",
                        "/oauth/**").permitAll()
                .anyRequest().authenticated().and().httpBasic();
    }

    @Autowired
    public void configureGlobal(
            AuthenticationManagerBuilder auth,
            @Qualifier("dataSource") DataSource dataSource,
            PasswordEncoder passwordEncoder) throws Exception {
        // ensure the passwords are encoded properly
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username as username,\n" +
                        "       password,\n" +
                        "       is_enabled as enabled\n" +
                        "from users\n" +
                        "where username = ?")
                .authoritiesByUsernameQuery("select u.username as username,\n" +
                        "       r.role_name  as authority\n" +
                        "from users u\n" +
                        "       join user_roles ur on u.id = ur.user_id\n" +
                        "       join roles r on ur.role_id = r.id\n" +
                        "where u.username = ?")
                .passwordEncoder(passwordEncoder);
    }
}