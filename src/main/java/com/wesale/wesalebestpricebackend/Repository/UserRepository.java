package com.wesale.wesalebestpricebackend.Repository;

import com.wesale.wesalebestpricebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMobile(String mobile);
}
