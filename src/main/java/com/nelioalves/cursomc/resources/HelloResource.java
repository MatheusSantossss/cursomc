package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloResource {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Olá garaio";
    }

}
