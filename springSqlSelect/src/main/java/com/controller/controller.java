package com.controller;

import com.Service.test;
import com.domain.movies;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value = "/query_info/{name}")
    public String queryInfo(Model model , @PathVariable String name) throws Exception{
        test test = new test();
        movies movies = test.doIt(name);
        model.addAttribute("movies" , movies);
        return "index";
    }
}
