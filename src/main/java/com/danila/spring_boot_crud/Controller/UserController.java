package com.danila.spring_boot_crud.Controller;


import com.danila.spring_boot_crud.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/one_user")
    public String getMainUser(Model model, Principal principal) {
        model.addAttribute("one_user",userService.findByEmail(principal.getName()));
        //model.addAttribute("one_user",userService.getUserByEmail(((User) authentication.getPrincipal()).getEmail()));
        return "one_user";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

}
