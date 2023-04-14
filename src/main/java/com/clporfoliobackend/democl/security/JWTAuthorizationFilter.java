/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.security;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.core.context.SecurityContextHolder;

@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String bearerToken = request.getHeader("Authorization");

            if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
                String token = bearerToken.replace("Bearer ", "");
                UsernamePasswordAuthenticationToken usernamePAT = TokenUtils.getAuthentication(token);
                SecurityContextHolder.getContext().setAuthentication(usernamePAT);
            }

            filterChain.doFilter(request, response);
        } catch (AccessDeniedException e) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        } catch (AuthenticationException e) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden" + e.getMessage());
        } catch (IOException | ServletException e) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden: Authentication failed");
        }
    }
}