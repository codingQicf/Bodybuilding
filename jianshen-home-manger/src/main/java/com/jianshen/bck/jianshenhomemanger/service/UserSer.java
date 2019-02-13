package com.jianshen.bck.jianshenhomemanger.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jianshen.bck.jianshenhomemanger.dao.UserDao;
import com.jianshen.bck.jianshenhomemanger.po.User;

/**
 * @date ${date} ${time}
 */
@Service
public class UserSer {

    @Autowired
    private UserDao dao;
    
    public List<User> userAll(){
    	return dao.findAll();
    }
    
    public User getUserById(Integer id) {
		return dao.getUserById(id);
    }
    
    public User addUser(User user) {
    	return dao.save(user);
    }
    
    public void delUser(Integer id) {
    	 dao.deleteById(id);
    }
    
    public List<User> userList() {
    	return dao.getUserList();
    }
    
    public User UserLogin(String username,String password) {
    	return dao.getUserInfo(username, password);
    }
    
    public List<User> getCoachList(Integer count){
    	return dao.getCoachUserList(count);
    }
}
