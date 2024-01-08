package com.akriskovets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){
        modelMap.addAttribute("message",
                "Hello Lenochka!");
        return "hello_world";
    }

}
