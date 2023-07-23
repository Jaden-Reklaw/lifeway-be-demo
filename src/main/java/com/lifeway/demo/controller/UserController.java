package com.lifeway.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Getting All Users!";
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
