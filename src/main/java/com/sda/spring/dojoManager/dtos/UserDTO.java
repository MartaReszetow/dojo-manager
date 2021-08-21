package com.sda.spring.dojoManager.dtos;

import com.sda.spring.dojoManager.UsersRole;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String login;
    private String password;
    private UsersRole usersRole;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private List<ClubMemberDTO> clubMemberList;


    public UserDTO(String name, String surname, String phoneNumber, String email, String login, UsersRole usersRole) {
        this.login = login;
        this.usersRole = usersRole;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserDTO(String login, UsersRole usersRole, String name, String surname, String email, String phoneNumber, List<ClubMemberDTO> clubMemberList) {
        this.login = login;
        this.usersRole = usersRole;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clubMemberList = clubMemberList;
    }
}
