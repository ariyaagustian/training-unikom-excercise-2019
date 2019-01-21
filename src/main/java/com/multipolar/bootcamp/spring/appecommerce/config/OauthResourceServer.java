package com.multipolar.bootcamp.spring.appecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;



    @EnableResourceServer
    @Configuration
    public class OauthResourceServer extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            RemoteTokenServices tokenService = new RemoteTokenServices();
            tokenService.setClientId("ecommerce-api");
            tokenService.setClientSecret("admin");
            tokenService.setCheckTokenEndpointUrl("http://localhost:8080/oauth/check_token");

            resources
                    .resourceId("ecommerce")
                    .tokenServices(tokenService);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/swagger-ui.html",
                            "/swagger-resources/**",
                            "/v2/api-docs",
                            "/oauth/**").permitAll()
                    .anyRequest().authenticated();

        }
    }

