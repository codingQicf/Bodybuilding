package com.jianshen.bck.jianshenhomemanger.dao;

import com.jianshen.bck.jianshenhomemanger.po.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 增删改需用@modify注解
 * 使用原生sql > @Query(value="select * from t_book order by RAND() LIMIT ?1",nativeQuery=true)
 */
public interface HelloDao extends JpaRepository<Hello,Integer> {




}

