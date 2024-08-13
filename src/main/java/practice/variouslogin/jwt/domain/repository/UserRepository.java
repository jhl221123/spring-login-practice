package practice.variouslogin.jwt.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practice.variouslogin.jwt.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Boolean existsByName(String username);
}
