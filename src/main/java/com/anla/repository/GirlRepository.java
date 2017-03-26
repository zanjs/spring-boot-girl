package com.anla.repository;

import com.anla.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Anl on 2017/3/23.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    /**
     * 通过年龄查查
     * @param age
     * @return
     */
    public List<Girl> findByAge(Integer age);
}
