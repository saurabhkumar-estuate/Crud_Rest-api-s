package Springboot_restApi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Springboot_restApi1.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
