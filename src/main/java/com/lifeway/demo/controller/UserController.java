package com.lifeway.demo.controller;

import com.lifeway.demo.model.User;
import com.lifeway.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> allUsers = userService.getAllUsers();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(allUsers);
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Getting User By Id: " + id;
    }

    @PostMapping
    public String createNewUser() {
        return "Creating new user!";
    }

    @PutMapping("/{id}")
    public String updateUserById(@PathVariable Long id) {
        return "Updating user by Id: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        return "Deleting user by Id: " + id;
    }
}
