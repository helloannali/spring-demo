package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author why
 * Date 16-5-5
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}
