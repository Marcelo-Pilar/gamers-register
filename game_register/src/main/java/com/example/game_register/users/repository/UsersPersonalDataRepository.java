package com.example.game_register.users.repository;

import com.example.game_register.users.entity.UsersPersonalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersPersonalDataRepository extends JpaRepository<UsersPersonalData, Long> {
}
