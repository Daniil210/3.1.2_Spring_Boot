package com.danila.spring_boot_crud.dao;

import com.danila.spring_boot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
