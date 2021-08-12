package com.danila.spring_boot_crud.controller;


import com.danila.spring_boot_crud.model.User;
import com.danila.spring_boot_crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class AdminController {

    private final UserService userService;


    @GetMapping(value = "/admin")
    public String listUsers(Model model, Principal principal ) {
        model.addAttribute("personA",userService.findByEmail(principal.getName()));
        model.addAttribute("people", userService.findAll());
        model.addAttribute("person2", new User());
        return "admin";
    }


    @PostMapping("/admin")
    public String createUser(@ModelAttribute("person") @Valid User user, BindingResult bindingResult)  {

        if (bindingResult.hasErrors()) {
            return "admin";
        }

        userService.saveUser(user);
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }


    @PostMapping("admin/{id}")
    public String updateUser(@ModelAttribute("person") @Valid User user, BindingResult bindingResult,
                             @PathVariable("id") Long id) {
        if (bindingResult.hasErrors()) {
            return "/admin/{id}";
        }

        userService.update(user, id);
        return "redirect:/admin";
    }


    @GetMapping("/user")
    public String getMainUser(Model model, Principal principal) {
        model.addAttribute("person",userService.findByEmail(principal.getName()));
        //model.addAttribute("one_user",userService.getUserByEmail(((User) authentication.getPrincipal()).getEmail()));
        return "show";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }


}
