package com.example.game_register.users.controller;

import com.example.game_register.GameRegisterApplication;
import com.example.game_register.users.entity.UsersPersonalData;
import com.example.game_register.users.service.UsersPersonalDataService;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsersPersonalDataController {
    private static final Logger log = LoggerFactory.getLogger(GameRegisterApplication.class);

    @Autowired
    UsersPersonalDataService usersPersonalDataService;



    @PostMapping
    public ResponseEntity<UsersPersonalData> save(@Valid @RequestBody UsersPersonalData usersPersonalData) {
        usersPersonalDataService.saveUser(usersPersonalData);
        log.info("User successfully created");
        return new ResponseEntity<> (HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UsersPersonalData> updateUser(@Valid @PathVariable long userId, @RequestBody UsersPersonalData newUserPersonalData){
        Optional<UsersPersonalData> oldUser = usersPersonalDataService.findById(userId);
        if (oldUser.isPresent()){
            usersPersonalDataService.updateUser(userId, newUserPersonalData);
            log.info("User " + newUserPersonalData.getUserName() + " successfully updated");
            return new ResponseEntity<>(newUserPersonalData, HttpStatus.OK);
        } else {
            log.info("User not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UsersPersonalData> getUserById(@PathVariable long userId){
        Optional<UsersPersonalData> user  = usersPersonalDataService.findById(userId);
        if(user.isPresent()){
            log.info("User " + user.get().getUserName() + " successfully retrieved");
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            log.info("User not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<UsersPersonalData> getAllUsers(){
        return usersPersonalDataService.findAllUsers();
    }



}
