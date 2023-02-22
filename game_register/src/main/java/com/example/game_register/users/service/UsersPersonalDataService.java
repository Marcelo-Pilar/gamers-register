package com.example.game_register.users.service;

import com.example.game_register.users.entity.UsersPersonalData;

import com.example.game_register.users.repository.UsersPersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsersPersonalDataService {

    @Autowired
    private UsersPersonalDataRepository usersPersonalDataRepository;

    public UsersPersonalData saveUser(UsersPersonalData usersPersonalData){
        usersPersonalDataRepository.save(usersPersonalData);
        return usersPersonalData;
    }

    public List<UsersPersonalData> findAllUsers(){
      return usersPersonalDataRepository.findAll();
    }

    public Optional<UsersPersonalData> findById(long userId) {
        return usersPersonalDataRepository.findById(userId);
    }

    public UsersPersonalData updateUser(long userId, UsersPersonalData newUserPersonalData){
       Optional<UsersPersonalData> oldUserData =  usersPersonalDataRepository.findById(userId);
       UsersPersonalData updatedUserPersonalData = oldUserData.get();
       updatedUserPersonalData.setUserName(newUserPersonalData.getUserName());
       updatedUserPersonalData.setAge(newUserPersonalData.getAge());
       updatedUserPersonalData.setGender(newUserPersonalData.getGender());

       return updatedUserPersonalData;

    }
}
