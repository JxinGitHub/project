package com.eazyfree;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class Controller implements InitializingBean {

    @RequestMapping("/hello/{str}")
    private String demo (@PathVariable(name = "str") String str){
        return str + "q";
    }

    @PostConstruct
    public void init() {
        System.out.println("--");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====================");
    }
}
