package com.danila.spring_boot_crud;

import com.danila.spring_boot_crud.model.Role;
import com.danila.spring_boot_crud.model.User;
import com.danila.spring_boot_crud.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void Testing() {
		/*AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userService = context.getBean(UserDao.class);*/


        User user1 = new User("naaasos", "laaaas", 32,"asaf@s", "adasf");
		User user2 = new User("naaasos", "laaaas", 32,"asaf@a", "adasf");
        Role role1 = new Role("ROLE_ADMIN");
        Role role2 = new Role("ROLE_USER");

		user1.getRoles().add(role1);
		//user1.setId(1l);
		//user2.getRoles().add(role2);
		//user2.getRoles().add(role1);
		userService.saveUser(user1);
		//userService.updateUser(user1);

		//System.out.println(userService.getUserByEmail("memtt@pozvonim.com"));
		//userService.deleteUserById(user1);
	}

}
