package com.hers.spring.boot.starter.controller;

import com.hers.spring.boot.starter.dto.CreateUserRequest;
import com.hers.spring.boot.starter.entity.User;
import com.hers.spring.boot.starter.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> list() { return userRepository.findAll(); }

    @PostMapping
    public ResponseEntity<User> create(@Validated @RequestBody CreateUserRequest createUserRequest) {
        log.info("CreateUserRequest request body: {}", createUserRequest);
        User.UserBuilder builder = User.builder()
                .firstName(createUserRequest.getFirstName())
                .lastName(createUserRequest.getLastName());

        User user = userRepository.save(builder.build());
        return ResponseEntity.created(URI.create("/api/user/" + user.getId())).body(user);
    }
}
