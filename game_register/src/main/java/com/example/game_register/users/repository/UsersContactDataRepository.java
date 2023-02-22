package com.example.game_register.users.repository;

import com.example.game_register.users.entity.UsersContactData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersContactDataRepository extends JpaRepository<UsersContactData, Long> {
}
