package com.danila.spring_boot_crud.service;



import com.danila.spring_boot_crud.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User userDto) ;

    void deleteUser(Long userId);

    User findByEmail(String email);

    User findById(Long id);

    List<User> findAll();

    void update(User user, Long id);

}
