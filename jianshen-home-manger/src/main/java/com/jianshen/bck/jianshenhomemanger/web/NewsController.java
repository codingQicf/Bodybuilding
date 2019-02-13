package com.jianshen.bck.jianshenhomemanger.web;

import com.jianshen.bck.jianshenhomemanger.po.News;
import com.jianshen.bck.jianshenhomemanger.service.NewsSer;
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
@Api(tags="News模块") //模块名称，中文 (必填)
@CrossOrigin //开启跨域
public class NewsController {

    @Autowired
    private NewsSer ser;

    /**
           * 查询资讯列表
     * @return
     */
    @GetMapping("/3001")
    @ApiOperation(value="显示News列表", notes="显示News列表")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getList(){
        Result result = new Result();
        List<News> NewsList = ser.NewsAll(); 
        result.setData(NewsList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询News列表成功"); 
        return result;
    }
    
    
    @GetMapping("/3002")
    @ApiOperation(value="显示News列表8条", notes="显示News列表8条")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getNewsList(){
        Result result = new Result();
        List<News> NewsList =ser.NewsList();  
        result.setData(NewsList);
        result.setOk(Result.ok().getOk()); 
        result.setStatus(200);
        result.setMsg("查询News列表成功"); 
        return result;
    }
    
    /**
           * 查询资讯信息
     * @return
     */
    @GetMapping("/3003")
    @ApiOperation(value="显示News信息", notes="显示News信息,参数：id")
    @Transactional(propagation = Propagation.SUPPORTS) // 查询用SUPPORTS 增删改用REQUIRED
    public Result getNewsById(Integer id){
        Result result = new Result();
        News News= ser.getNewsById(id); 
        if(News!=null) {
	        result.setData(News);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("查询NewsInfo成功"); 
	        return result;
        }
        result.setData(null);
        result.setStatus(400);
        result.setMsg("资讯不存在"); 
        return result;
    }

    /**
            * 添加资讯信息
     * @return
     */
    @GetMapping("/3004")
    @ApiOperation(value="显示News信息", notes="显示News信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result addNews(News News){
        Result result = new Result();
        News News1= ser.addNews(News); 
        if(News1!=null) {
	        result.setData(News1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("添加News成功"); 
	        return result;
        }
        result.setData(News1);
        result.setStatus(500);
        result.setMsg("添加失败"); 
        return result;
    }

    /**
           * 更新资讯信息
     * @return
     */
    @GetMapping("/3005")
    @ApiOperation(value="更新News信息", notes="更新News信息,参数：id")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result updateNews(News News){
        Result result = new Result();
        News News1= ser.addNews(News); 
        if(News!=null) {
	        result.setData(News1);
	        result.setOk(Result.ok().getOk()); 
	        result.setStatus(200);
	        result.setMsg("更新News成功"); 
	        return result;
        }
        result.setData(News1);
        result.setStatus(500);
        result.setMsg("更新失败"); 
        return result;
    }
    /**
           * 删除资讯信息
     * @return
     */
    @GetMapping("/3006")
    @ApiOperation(value="删除News信息", notes="删除News信息,参数：id,删除成功返回1")
    @Transactional(propagation = Propagation.REQUIRED) // 查询用SUPPORTS 增删改用REQUIRED
    public Result delNewsById(Integer id){
        Result result = new Result();
        ser.delNews(id);
	    result.setData(1);
	    result.setOk(Result.ok().getOk()); 
	    result.setStatus(200);
	    result.setMsg("删除News成功"); 
        return result;
    }
    
}
