/*
package com.danila.spring_boot_crud.Service;

//import static org.junit.jupiter.api.Assertions.*;

import com.danila.spring_boot_crud.Dao.UserDao;
import com.danila.spring_boot_crud.Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

class DefaultUserServiceTest {

    private UserService userService;
    private UserDao userDao;
    private UsersConverter usersConverter;
    private User user;

    @BeforeEach
    void setUp() {
        userDao = mock(UserDao.class);
        usersConverter = new UsersConverter();
        user = User.builder().password("testPass").email("testEmail").id(1l).build();
        when(userDao.save(any())).thenReturn(user);
        userService = new DefaultUserService(userDao, usersConverter);

    }

    @Test
    void saveUserReturnUserDto() {

    }

}*/
