package com.cdac.controller;

import com.cdac.modal.User;
import com.cdac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User>getUserProfile(@RequestHeader("Authorization")String jwt){
        User user=userService.getUserProfile(jwt);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<User>>getUsers(@RequestHeader("Authorization")String jwt){
       List <User> users=userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
