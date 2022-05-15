package com.movie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
