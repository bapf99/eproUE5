package de.thbingen.epro.vl5.controller;

import de.thbingen.epro.vl5.UserRepository;
import de.thbingen.epro.vl5.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class RESTController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> allUsers() {
        return userRepository.getAllById();
    }

    /*
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return userRepository.findById(id);
    }
    */

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody User user){
        String regex = "^(.+)@(\\S+)$"; //TODO: Test
        if(user.getEmail().matches(regex)) {
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("Invalid email");
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
