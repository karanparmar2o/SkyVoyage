package com.kingsairline.booking.repository;

import com.kingsairline.booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findById(Long userId);

    User findByUsername(String username);

    boolean existsByUsername(String username);
}
