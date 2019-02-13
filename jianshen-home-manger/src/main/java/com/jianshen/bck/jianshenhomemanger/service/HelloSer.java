package com.jianshen.bck.jianshenhomemanger.service;

import com.jianshen.bck.jianshenhomemanger.dao.HelloDao;
import com.jianshen.bck.jianshenhomemanger.po.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author 陈小龙
 * @date ${date} ${time}
 */
@Service
public class HelloSer {

    @Autowired
    private HelloDao dao;
    
    public List<Hello> getHello(){
        return dao.findAll();
    }



}
