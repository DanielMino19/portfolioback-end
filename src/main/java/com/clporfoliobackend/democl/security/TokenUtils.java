/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class TokenUtils {
    
    private  final static String ACCESS_TOKEN_SECRET = "3QñÑ2sdasSDFñLFLñ32412HDSD3dsd2w9Udds";
    private final static Long ACCESS_TOKEN_VALIDITY_SECODS = 2_100_000L;
    
    
    
    public static String createToken(String nombre, String email){
    long expirationTime = ACCESS_TOKEN_VALIDITY_SECODS * 1_000;  
    Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
    
    Map<String, Object> extra = new HashMap<>();
    extra.put("nombre",nombre);
    
    return Jwts.builder()
            .setSubject(email)
            .setExpiration(expirationDate)
            .addClaims(extra)
            .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
            .compact();
    }
    
      public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try{
                    Claims claims = Jwts.parserBuilder()
                .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        
        String email = claims.getSubject();
        
        return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
    } catch (JwtException e){
        return null;
        }
   }
    
}
    

