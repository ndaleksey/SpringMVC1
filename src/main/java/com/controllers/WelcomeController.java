package com.controllers;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 27.09.2014.
 */
@Controller
public class WelcomeController {
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping(name = "/welcome")
    public String welcome() {
        return "welcome";
    }
}
