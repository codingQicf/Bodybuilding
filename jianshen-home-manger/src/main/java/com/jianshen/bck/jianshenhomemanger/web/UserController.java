package com.jianshen.bck.jianshenhomemanger.web;

import com.jianshen.bck.jianshenhomemanger.po.User;
import com.jianshen.bck.jianshenhomemanger.service.UserSer;
import com.jianshen.bck.jianshenhomemanger.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@ApiModel("hello模块")
@Api(tags="User模块") //模块名称，中文 (必填)
@CrossOrigin //开启跨域
public class UserController {

    @Autowired
    private UserSer ser;

    /**
           * 查询用户列表
     * @return
     */
    @GetMapping("/1001")
    @ApiOperation(value="显示User列表", notes="显示User列表")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getList(){
        Result result = new Result();
        List<User> userList = ser.userAll(); 
        result.setData(userList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询User列表成功"); 
        return result;
    }
    
    
    @GetMapping("/1002")
    @ApiOperation(value="显示User列表8条", notes="显示User列表8条")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getUserList(){
        Result result = new Result();
        List<User> userList =ser.userList();  
        result.setData(userList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询User列表成功"); 
        return result;
    }
    
    /**
           * 查询用户信息
     * @return
     */
    @GetMapping("/1003")
    @ApiOperation(value="显示User信息", notes="显示User信息,参数：id")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getUserById(Integer id){
        Result result = new Result();
        User user= ser.getUserById(id); 
        if(user!=null) {
	        result.setData(user);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("查询UserInfo成功"); 
	        return result;
        }
        result.setData(null);
        result.setStatus(400);
        result.setMsg("用户不存在"); 
        return result;
    }

    /**
            * 添加用户信息
     * @return
     */
    @GetMapping("/1004")
    @ApiOperation(value="显示User信息", notes="显示User信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result addUser(User user){
        Result result = new Result();
        User user1= ser.addUser(user); 
        if(user1!=null) {
	        result.setData(user1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("添加User成功"); 
	        return result;
        }
        result.setData(user1);
        result.setStatus(500);
        result.setMsg("添加失败"); 
        return result;
    }

    /**
     * 更新用户信息
     * @return
     */
    @GetMapping("/1005")
    @ApiOperation(value="更新User信息", notes="更新User信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result updateUser(User user){
        Result result = new Result();
        User user1= ser.addUser(user); 
        if(user!=null) {
	        result.setData(user1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("更新User成功"); 
	        return result;
        }
        result.setData(user1);
        result.setStatus(500);
        result.setMsg("更新失败"); 
        return result;
    }
    /**
           * 删除用户信息
     * @return
     */
    @GetMapping("/1006")
    @ApiOperation(value="删除User信息", notes="删除User信息,参数：id,删除成功返回1")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result delUserById(Integer id){
        Result result = new Result();
        ser.delUser(id);
	    result.setData(1);
	    result.setOk(Result.ok().getOk()); 
	    result.setStatus(200);
	    result.setMsg("删除User成功"); 
        return result;
    }
    
    /**
     * 登陆或注册
     * @return
     */
    @GetMapping("/1007")
    @ApiOperation(value="登陆或注册", notes="登陆或注册,参数：username,password")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result LoginOrRegist(String username,String password){
        Result result = new Result();
        User user = ser.UserLogin(username, password);
        if(user==null) {
        	User user1=new User();
        	user1.setIsPm(0);
        	user1.setUsername(username);
        	user1.setPassword(password);
        	ser.addUser(user1);
        	result.setData(1);
    	    result.setOk(Result.ok().getOk()); 
    	    result.setStatus(200);
    	    result.setMsg("注册成功");
    	    return result;
        }
	    result.setData(user);
	    result.setOk(Result.ok().getOk()); 
	    result.setStatus(200);
	    result.setMsg("登陆成功"); 
        return result;
    }
    
   
    @GetMapping("/1008/{count}")
    @ApiOperation(value="教练列表查询",notes="教练列表查询，每次返回8条数据")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getCoachUserList(@PathVariable("count")Integer count){
    	Result result = new Result();
    	List<User> coachList = ser.getCoachList(count);
    	if(coachList!=null) {
    		result.setData(coachList);
    	    result.setOk(Result.ok().getOk()); 
    	    result.setStatus(200);
    	    result.setMsg("查询成功");
    	    return result;
    	}
    	result.setData(coachList);
        result.setStatus(500);
        result.setMsg("没有更多的教练"); 
		return result;
    }
    
    
    

}
