package com.example.springbatchtodb.repositories;

import com.example.springbatchtodb.entities.User;
import com.example.springbatchtodb.entities.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Set<Role> findByUsers(User user);


}
