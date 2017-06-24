package ru.pip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.pip.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goMain(HttpServletRequest request, ModelMap model) {
        model.addAttribute("user", userService.getUser(1111));
        return "login";
    }
}
