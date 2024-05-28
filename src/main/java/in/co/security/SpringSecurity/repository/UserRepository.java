package in.co.security.SpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.security.SpringSecurity.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	Optional<User> findByUsername(String username);

	  Boolean existsByUsername(String username);

	  Boolean existsByEmail(String email);
}
