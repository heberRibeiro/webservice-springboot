package br.com.projects.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projects.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
