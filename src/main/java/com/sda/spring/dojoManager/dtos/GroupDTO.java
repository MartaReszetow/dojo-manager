package com.sda.spring.dojoManager.dtos;

import lombok.*;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDTO {
    private String name;
    private int defaultPrice;

}
