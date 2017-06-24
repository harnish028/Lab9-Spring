package ru.pip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goMain(HttpServletRequest request, ModelMap model) {
        return "login";
    }
}
