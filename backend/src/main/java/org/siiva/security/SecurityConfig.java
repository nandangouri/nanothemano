package org.siiva.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors() // Enable CORS before other configurations
                .and()
                .csrf().disable() // Disable CSRF protection
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/**").permitAll() // Allow GET requests to all endpoints
                .antMatchers(HttpMethod.POST, "/**").permitAll() // Allow GET requests to all endpoints
                .antMatchers(HttpMethod.DELETE, "/**").permitAll() // Allow GET requests to all endpoints
                .antMatchers(HttpMethod.PUT, "/**").permitAll(); // Allow GET requests to all endpoints
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("*");
            }
        };
    }
}
