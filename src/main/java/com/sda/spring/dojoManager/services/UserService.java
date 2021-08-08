package com.sda.spring.dojoManager.services;



import com.sda.spring.dojoManager.UsersRole;
import com.sda.spring.dojoManager.dtos.UserDTO;
import com.sda.spring.dojoManager.entities.UserEntity;
import com.sda.spring.dojoManager.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createNewUser(UserDTO userDTO){
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
}
