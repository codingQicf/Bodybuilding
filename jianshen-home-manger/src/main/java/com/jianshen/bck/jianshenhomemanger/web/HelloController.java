package com.jianshen.bck.jianshenhomemanger.web;

import com.jianshen.bck.jianshenhomemanger.po.Hello;
import com.jianshen.bck.jianshenhomemanger.service.HelloSer;
import com.jianshen.bck.jianshenhomemanger.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@ApiModel("hello模块")
@Api(tags="hello模块") //模块名称，中文 (必填)
@CrossOrigin //开启跨域
public class HelloController {

    @Autowired
    private HelloSer ser;

    @GetMapping("/00001")
    @ApiOperation(value="显示hello列表", notes="显示hello列表") // swagger value="该方法的作用" notes一样
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getList(){
        Result result = new Result();
        List<Hello> hello = ser.getHello(); // 无需使用try——catch
        result.setData(hello); //设置数据 (必填可null)
        result.setOk(Result.ok().getOk()); // 说明请求成功 (必填)
        result.setStatus(200); //返回状态码 (必填)
        result.setMsg("查询hello列表成功"); // 返回信息(必填)
        return result;
    }





}
