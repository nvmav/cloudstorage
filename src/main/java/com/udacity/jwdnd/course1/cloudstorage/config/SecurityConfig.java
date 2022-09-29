package com.udacity.jwdnd.course1.cloudstorage.config;

import com.udacity.jwdnd.course1.cloudstorage.service.AuthenticationService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //source of configuration for IOC context
@EnableWebSecurity

/*
 * In order for Spring to actually use our AuthenticationService,
 * we need to extend our Web Security configuration.
 * We do that with an adapter for the WebSecurityConfigurer
 * */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private AuthenticationService authenticationService;

  public SecurityConfig(AuthenticationService authenticationService) {
    this.authenticationService = authenticationService;
  }


  //used to tell Spring to use our AuthenticationService to check user logins
  @Override
  protected void configure(AuthenticationManagerBuilder auth) {
    auth.authenticationProvider(this.authenticationService);
  }

  /*
  used to configure the HttpSecurity object by chaining methods to express security requirements
  */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        //Allows all users to access the /signup page, as well as the css and js files.
        .antMatchers("/signup", "/css/**", "/js/**").permitAll()
        //Allows authenticated users to make any request that's not explicitly covered elsewhere.
        .anyRequest().authenticated();

    //Generates a login form at /login endpoint and allows anyone to access it.
    http.formLogin()
        .loginPage("/login")
        .permitAll();

    //Redirects successful logins to the /home page.
    http.formLogin()
        .defaultSuccessUrl("/home", true);
  }


}