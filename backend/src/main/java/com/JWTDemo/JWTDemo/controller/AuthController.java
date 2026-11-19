
package com.JWTDemo.JWTDemo.controller;

import com.JWTDemo.JWTDemo.dto.AuthRequest;
import com.JWTDemo.JWTDemo.dto.AuthResponse;
import com.JWTDemo.JWTDemo.entity.User;
import com.JWTDemo.JWTDemo.repository.UserRepository;
import com.JWTDemo.JWTDemo.service.JwtService;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    // User Registration
    @PostMapping("/register")
    public ResponseEntity<?> register(
            @Valid @RequestBody AuthRequest authRequest
    ) {

        if (userRepository.findByUsername(authRequest.username()).isPresent()) {

            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(Map.of("error", "Username is already in use"));
        }

        User user = new User(
                authRequest.username(),
                passwordEncoder.encode(authRequest.password())
        );

        userRepository.save(user);

        return ResponseEntity.ok(
                Map.of("message", "User registered successfully")
        );
    }

    // User Login
    @PostMapping("/login")
    public ResponseEntity<?> login(
            @Valid @RequestBody AuthRequest req
    ) {

        var user = userRepository.findByUsername(req.username())
                .orElse(null);

        if (user == null ||
                !passwordEncoder.matches(req.password(), user.getPassword())) {

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "Username or password is incorrect"));
        }

        String token = jwtService.generateToken(user.getUsername());

        return ResponseEntity.ok(
                new AuthResponse(token)
        );
    }
}
