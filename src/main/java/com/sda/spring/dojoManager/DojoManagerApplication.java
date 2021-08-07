package com.sda.spring.dojoManager;

import com.sda.spring.dojoManager.dtos.ClubMemberDTO;
import com.sda.spring.dojoManager.dtos.GroupDTO;
import com.sda.spring.dojoManager.dtos.UserDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

import static com.sda.spring.dojoManager.UsersRole.USER_COACH;

@SpringBootApplication
public class DojoManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DojoManagerApplication.class, args);



    }

}
