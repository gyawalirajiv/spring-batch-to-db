package com.example.springbatchtodb.entities.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {

    private Long role_id;
    private String role_name;

}
