package com.example.springbatchtodb.repositories;

import com.example.springbatchtodb.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByUsername(String username);

    User findByUsername(String username);

    //    @Query(value = "SELECT * FROM user WHERE username = ?1", nativeQuery = true)
    Optional<User> findOneByUsernameIgnoreCase(String username);

    //    @Query(value = "SELECT * FROM user WHERE email = ?1", nativeQuery = true)
    Optional<User> findOneByEmailIgnoreCase(String email);

    Optional<User> findOneByPhoneNumber(Long phoneNumber);

    Page<User> findAll(Pageable pageable);

    List<User> findAll();

    Optional<User> findOneWithAuthoritiesByUsername(String login);

    Page<User> findAllByFullNameContaining(Pageable pageable, String fullName);
}
