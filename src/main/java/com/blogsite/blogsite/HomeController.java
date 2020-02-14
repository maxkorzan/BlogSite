package com.blogsite.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("/about.html")
    public String about(){
        return "about";
    }

    @RequestMapping("/bootcamp.html")
    public String bootcamp(){
        return "bootcamp";
    }

    @RequestMapping("/html-html.html")
    public String html(){
        return "html-html";
    }

    @RequestMapping("/html-css.html")
    public String css(){
        return "html-css";
    }

    @RequestMapping("/html-javascript.html")
    public String javascript(){
        return "html-javascript";
    }

    @RequestMapping("/github01.html")
    public String github01(){
        return "github01";
    }

    @RequestMapping("/github02.html")
    public String github02(){
        return "github02";
    }

    @RequestMapping("/pseudocode.html")
    public String pseudocode(){
        return "pseudocode";
    }

    @RequestMapping("/logic.html")
    public String logic(){
        return "logic";
    }



//////////////////////////////////////////////////////////

    @RequestMapping("/contact.html")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/post.html")
    public String post(){
        return "post";
    }



}
