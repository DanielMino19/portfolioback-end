/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    
    
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException{
        
        AuthCredentials authCredentials = new AuthCredentials();
        
        try{
         authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);    
           logger.info("Authentication successful for user " + authCredentials.getEmail());
           
        } catch (IOException e){ 
            logger.error("Error while attempting authentication", e);
        } catch (java.io.IOException ex) {
            Logger.getLogger(JWTAuthenticationFilter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
                authCredentials.getEmail(),
                authCredentials.getPassword(),
                Collections.emptyList()
        );
            
        
      
        return getAuthenticationManager().authenticate(usernamePAT);
    }
       @Override
       protected void successfulAuthentication(HttpServletRequest request,
                                             HttpServletResponse response,
                                             FilterChain chain,
                                             Authentication authResult) throws IOException, ServletException, java.io.IOException{
           
          UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
           String token = TokenUtils.createToken(userDetails.getNombre(), userDetails.getUsername());
          
          response.addHeader("Authorization","Bearer " + token);
          response.getWriter().flush();
           
        super.successfulAuthentication(request, response, chain, authResult);
       }
}
