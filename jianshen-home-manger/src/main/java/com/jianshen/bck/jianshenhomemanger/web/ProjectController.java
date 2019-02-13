package com.jianshen.bck.jianshenhomemanger.web;

import com.jianshen.bck.jianshenhomemanger.po.Project;
import com.jianshen.bck.jianshenhomemanger.service.ProjectSer;
import com.jianshen.bck.jianshenhomemanger.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@ApiModel("hello模块")
@Api(tags="Project模块") //模块名称，中文 (必填)
@CrossOrigin //开启跨域
public class ProjectController {

    @Autowired
    private ProjectSer ser;

    /**
           * 查询项目列表
     * @return
     */
    @GetMapping("/2001")
    @ApiOperation(value="显示Project列表", notes="显示Project列表")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getList(String ptype){
        Result result = new Result();
        List<Project> ProjectList = ser.ProjectAll(ptype); 
        result.setData(ProjectList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询Project列表成功"); 
        return result;
    }
    
    
    @GetMapping("/2002")
    @ApiOperation(value="显示Project列表8条", notes="显示Project列表8条")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getProjectList(String ptype,Integer count){
        Result result = new Result();
        List<Project> ProjectList =ser.ProjectList(ptype,count);  
        result.setData(ProjectList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询Project列表成功"); 
        return result;
    }
    
    /**
     * 查询项目信息
     * @return
     */
    @GetMapping("/2003")
    @ApiOperation(value="显示Project信息", notes="显示Project信息,参数：id")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getProjectById(Integer id){
        Result result = new Result();
        Project Project= ser.getProjectById(id); 
        if(Project!=null) {
	        result.setData(Project);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("查询ProjectInfo成功"); 
	        return result;
        }
        result.setData(null);
        result.setStatus(400);
        result.setMsg("项目不存在"); 
        return result;
    }

    /**
            * 添加项目信息
     * @return
     */
    @GetMapping("/2004")
    @ApiOperation(value="添加Project信息", notes="添加Project信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result addProject(Project Project){
        Result result = new Result();
        Project Project1= ser.addProject(Project); 
        if(Project1!=null) {
	        result.setData(Project1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("添加Project成功"); 
	        return result;
        }
        result.setData(Project1);
        result.setStatus(500);
        result.setMsg("添加失败"); 
        return result;
    }

    /**
           * 更新项目信息
     * @return
     */
    @GetMapping("/2005")
    @ApiOperation(value="更新Project信息", notes="更新Project信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result updateProject(Project Project){
        Result result = new Result();
        Project Project1= ser.addProject(Project); 
        if(Project!=null) {
	        result.setData(Project1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("更新Project成功"); 
	        return result;
        }
        result.setData(Project1);
        result.setStatus(500);
        result.setMsg("更新失败"); 
        return result;
    }
    /**
           * 删除项目信息
     * @return
     */
    @GetMapping("/2006")
    @ApiOperation(value="删除Project信息", notes="删除Project信息,参数：id,删除成功返回1")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result delProjectById(Integer id){
        Result result = new Result();
        ser.delProject(id);
	    result.setData(1);
	    result.setOk(Result.ok().getOk()); 
	    result.setStatus(200);
	    result.setMsg("删除Project成功"); 
        return result;
    }
    
    @GetMapping("/2007")
    @ApiOperation(value="获取peoject类型列表",notes="获取peoject类型列表")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getprojectType() {
    	Result result = new Result();
    	List<String> projectTypeList = ser.getProjectTypeList();
    	result.setData(projectTypeList);
    	result.setOk(Result.ok().getOk());
    	result.setMsg("获得产品类型列表");
    	return result;
    }
    
}
