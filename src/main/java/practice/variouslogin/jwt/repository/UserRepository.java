package practice.variouslogin.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practice.variouslogin.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Boolean existsByName(String username);
}
