package org.spring.pcf.repository;

import java.util.List;
import java.util.Optional;

import org.spring.pcf.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);
	
	List<User> findAll();

}
