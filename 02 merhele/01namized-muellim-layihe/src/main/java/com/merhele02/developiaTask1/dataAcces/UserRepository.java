package com.merhele02.developiaTask1.dataAcces;

import com.merhele02.developiaTask1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
