package com.developia.developiaTask05.dataAcces;

import com.developia.developiaTask05.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

}
