package com.anla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * Created by Anl on 2017/3/23.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(16);
        girlA.setCupSize("G");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(19);
        girlB.setCupSize("F");
        girlRepository.save(girlB);


    }
}
