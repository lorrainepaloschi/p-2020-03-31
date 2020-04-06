package com.example.p2020_03_31.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
@RequestMapping("/app")
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView loginForm(@ModelAttribute Book book){
        ModelAndView mv = new ModelAndView();
        book = bs.getUserByLogin(book.getLogin(), book.getPwd());

        if(book == null){
            mv.setViewName("erro");
        }
        else{
            mv.setViewName("bookView");
        }
        mv.addObject("book", book)
        return mv;
    }
       
    }

    
