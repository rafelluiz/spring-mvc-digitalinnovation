package zup.spring.mvc.springmvcdigitalinnovation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//teste

@Controller
public class JediController {

    @GetMapping("/jedi")
    public String jedi(){
        return "jedi";
    }
}
