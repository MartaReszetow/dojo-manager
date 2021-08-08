package com.sda.spring.dojoManager.repositories;

import com.sda.spring.dojoManager.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
