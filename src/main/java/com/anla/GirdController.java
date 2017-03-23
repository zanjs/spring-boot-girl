package com.anla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Anl on 2017/3/23.
 */
@RestController
public class GirdController {
    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
}
