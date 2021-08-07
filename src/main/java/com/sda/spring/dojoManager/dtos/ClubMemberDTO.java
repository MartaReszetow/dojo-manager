package com.sda.spring.dojoManager.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubMemberDTO {

private String name;
private String surname;
private LocalDate dateOfBirth;
private GroupDTO group;
}
