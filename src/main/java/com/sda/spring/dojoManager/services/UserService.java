package com.sda.spring.dojoManager.services;


import com.sda.spring.dojoManager.UsersRole;
import com.sda.spring.dojoManager.dtos.UserDTO;
import com.sda.spring.dojoManager.entities.UserEntity;
import com.sda.spring.dojoManager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserEntity userEntity = null;

    private int counter = 1;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createNewUser(UserDTO userDTO) {
        // DTO->ENTITY

        final UserEntity userEntity = new UserEntity();
        userEntity.setLogin(userDTO.getLogin());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setUsersRole(UsersRole.USER_PARENT);
        userEntity.setName(userDTO.getName());
        userEntity.setSurname(userDTO.getSurname());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPhoneNumber(userDTO.getPhoneNumber());

        userRepository.save(userEntity);
    }

    public List<UserDTO> getAllUsersInfo() {
        // ENTITY->DTO


        final List<UserEntity> userEntityList = userRepository.findAll();
        final List<UserDTO> userDTOList= userEntityList.stream()
                .map(user -> new UserDTO(user.getName(), user.getSurname(),user.getPhoneNumber(),user.getEmail(),user.getLogin(),user.getUsersRole()))
                .collect(Collectors.toList());

        return userDTOList;

    }


}
