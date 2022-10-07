package com.example.springbatchtodb.entities.DTOs;


import com.example.springbatchtodb.entities.security.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private Long phoneNumber;
    private String imageUrl;
    private boolean enabled;
    private Set<Role> roles;

}
