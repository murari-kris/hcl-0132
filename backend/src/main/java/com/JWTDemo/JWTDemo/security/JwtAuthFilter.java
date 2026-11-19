
package com.JWTDemo.JWTDemo.security;

import com.JWTDemo.JWTDemo.service.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

@Component
@AllArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {

    private final JwtService jwtService;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        // 1. Get Authorization header
        String header = request.getHeader("Authorization");

        // 2. Continue if token is missing
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        // 3. Extract JWT
        String token = header.substring(7);

        try {

            // 4. Verify token and extract username
            String username = jwtService.verifyAndGetUsername(token);

            // 5. Set authentication if valid
            if (username != null &&
                    SecurityContextHolder.getContext().getAuthentication() == null) {

                var authentication =
                        new UsernamePasswordAuthenticationToken(
                                username,
                                null,
                                Collections.emptyList()
                        );

                SecurityContextHolder.getContext()
                        .setAuthentication(authentication);
            }

        } catch (Exception exception) {

            // Invalid token: clear authentication
            SecurityContextHolder.clearContext();
        }

        // 6. Continue filter chain
        filterChain.doFilter(request, response);
    }
}
