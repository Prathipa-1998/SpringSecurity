package in.co.security.SpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.security.SpringSecurity.entity.ERole;
import in.co.security.SpringSecurity.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>
{
	Optional<Role> findByName(ERole name);
}

