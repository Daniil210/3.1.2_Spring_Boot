package com.danila.spring_boot_crud.Service;

import com.danila.spring_boot_crud.Dao.UserDao;
import com.danila.spring_boot_crud.Model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Transactional
    @Override
    public User saveUser(User user)  {

        return userDao.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long userId) {
        userDao.deleteById(userId);
    }

    @Override
    public User findByEmail(String email) {

        return userDao.findByEmail(email);
    }

    @Override
    public User findById(Long id) {
        Optional<User> users = userDao.findById(id);
        User user = users.get();

        return user;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public void update(User user, Long id) {
        user.setId(id);
        userDao.save(user);
    }


}
