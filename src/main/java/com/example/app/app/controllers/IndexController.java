package com.example.app.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * IndexController for index.html page
 */
@Controller
@RequestMapping(path = "/", method = RequestMethod.POST)
public class IndexController {

    /**
     * Returns the index.html first page
     * @return index
     */
    @GetMapping(path = "/")
    public String indexHomePage() {
        return "index";
    }

}
