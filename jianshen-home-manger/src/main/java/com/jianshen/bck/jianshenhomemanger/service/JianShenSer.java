package com.jianshen.bck.jianshenhomemanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jianshen.bck.jianshenhomemanger.dao.JianShenDao;
import com.jianshen.bck.jianshenhomemanger.po.JianShen;

/**
 * @date ${date} ${time}
 */
@Service
public class JianShenSer {

    @Autowired
    private JianShenDao dao;
    
    public JianShen JianShenInfo(Integer jsuid){
    	return dao.getProjectInfo(jsuid);
    }
    
    public JianShen addJianShen(JianShen JianShen) {
    	return dao.save(JianShen);
    }
    
    public void delJianShen(Integer id) {
    	 dao.deleteById(id);
    }
    
    
}
