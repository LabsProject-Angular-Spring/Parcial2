package co.edu.unilibre.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.user.entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
