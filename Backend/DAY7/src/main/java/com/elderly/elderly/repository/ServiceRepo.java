// package com.elderly.elderly.repository;

// import org.springframework.data.jpa.repository.JpaRepository;

// import com.elderly.elderly.entity.Serviceentity;

// public interface ServiceRepo extends JpaRepository<Serviceentity, Long> {

// }

package com.elderly.elderly.repository;

import com.elderly.elderly.entity.Serviceentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<Serviceentity, Long> {
    Serviceentity findByName(String name);
    void deleteByName(String name);
    // Other methods...
}
