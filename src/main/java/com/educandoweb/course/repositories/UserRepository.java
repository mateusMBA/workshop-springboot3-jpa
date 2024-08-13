package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository é opcionail pq está extendendo o JpaRepository que ja eh registrado como componente do Spring
public interface UserRepository extends JpaRepository<User,Long> {

}
