package com.anla.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Anl on 2017/3/26.
 */
@Aspect
@Component
public class HttpAspect {
    @Before("execution(public * com.anla.controller.GirdController.girlList(..))")
    public void log(){
        System.out.println(1111);
    }
}
