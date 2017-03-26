package com.anla.controller;

import com.anla.domain.Girl;
import com.anla.repository.GirlRepository;
import com.anla.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by Anl on 2017/3/23.
 */
@RestController
public class GirdController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        System.out.println(22);
        return girlRepository.findAll();
    }



    /**
     * 添加一个女生
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl add(@Valid  Girl girl, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.printf("错误");
            return null;
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return girlRepository.save(girl);
    }

    /**
     * 查询谋个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl show(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    /**
     * 更新一个女生
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl update(@PathVariable("id") Integer id,
                      @RequestParam("cupSize") String cupSize,
                      @RequestParam("age") Integer age) {

        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     * 删除一个女生
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void del(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> showAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void two(){

        girlService.insertTwo();
    }
}
