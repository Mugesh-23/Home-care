package com.elderly.elderly.repository;

import com.elderly.elderly.entity.Bookentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Bookentity, Long> {
    Optional<Bookentity> findByUsername(String username);
    void deleteByUsername(String username);
}
