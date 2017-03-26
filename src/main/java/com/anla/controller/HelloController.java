package com.anla.controller;

import com.anla.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anl on 2017/3/22.
 */
@RestController
public class HelloController {
//    @Value("${cupSize}")
//    private String cupSize;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return girlProperties.getCupSize() + "ss22233333300";
    }
}
