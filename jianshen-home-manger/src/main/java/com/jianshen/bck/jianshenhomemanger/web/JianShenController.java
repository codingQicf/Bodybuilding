package com.jianshen.bck.jianshenhomemanger.web;

import com.jianshen.bck.jianshenhomemanger.po.JianShen;
import com.jianshen.bck.jianshenhomemanger.service.JianShenSer;
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
@Api(tags="JianShen模块") //模块名称，中文 (必填)
@CrossOrigin //开启跨域
public class JianShenController {

    @Autowired
    private JianShenSer ser;

    /**
     * 查询健身方案信息
     * @return
     */
    @GetMapping("/4001")
    @ApiOperation(value="显示JianShen信息", notes="显示JianShen信息,参数：id")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getJianShenById(Integer id){
        Result result = new Result();
        JianShen JianShen= ser.JianShenInfo(id); 
        if(JianShen!=null) {
	        result.setData(JianShen);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("查询JianShenInfo成功"); 
	        return result;
        }
        result.setData(null);
        result.setStatus(400);
        result.setMsg("健身方案不存在"); 
        return result;
    }

    /**
            * 添加健身方案信息
     * @return
     */
    @GetMapping("/4002")
    @ApiOperation(value="添加JianShen信息", notes="显示JianShen信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result addJianShen(JianShen JianShen){
        Result result = new Result();
        JianShen JianShen1= ser.addJianShen(JianShen); 
        if(JianShen1!=null) {
	        result.setData(JianShen1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("添加JianShen成功"); 
	        return result;
        }
        result.setData(JianShen1);
        result.setStatus(500);
        result.setMsg("添加失败"); 
        return result;
    }

    /**
           * 更新健身方案信息
     * @return
     */
    @GetMapping("/4003")
    @ApiOperation(value="更新JianShen信息", notes="更新JianShen信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result updateJianShen(JianShen JianShen){
        Result result = new Result();
        JianShen JianShen1= ser.addJianShen(JianShen); 
        if(JianShen!=null) {
	        result.setData(JianShen1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("更新JianShen成功"); 
	        return result;
        }
        result.setData(JianShen1);
        result.setStatus(500);
        result.setMsg("更新失败"); 
        return result;
    }
    /**
           * 删除健身方案信息
     * @return
     */
    @GetMapping("/4004")
    @ApiOperation(value="删除JianShen信息", notes="删除JianShen信息,参数：id,删除成功返回1")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result delJianShenById(Integer id){
        Result result = new Result();
        ser.delJianShen(id);
	    result.setData(1);
	    result.setOk(Result.ok().getOk()); 
	    result.setStatus(200);
	    result.setMsg("删除JianShen成功"); 
        return result;
    }
    
}
