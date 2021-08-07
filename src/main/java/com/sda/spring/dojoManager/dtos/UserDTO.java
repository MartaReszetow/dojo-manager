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


}
