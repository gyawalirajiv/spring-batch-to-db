package com.example.springbatchtodb.entities.security;


import com.example.springbatchtodb.entities.User;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    //TODO
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long role_id;
    private String role_name;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<User> users;

    public Role(Long role_id, String role_name, Set<User> users) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.users = users;
    }

    public Role() {
    }

    public String getRole_name() {
        return role_name;
    }
}
