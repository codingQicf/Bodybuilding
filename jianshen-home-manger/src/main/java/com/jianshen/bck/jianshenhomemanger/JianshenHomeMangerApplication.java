package com.jianshen.bck.jianshenhomemanger;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

@EnableAsync //开启异步
@RestController(value = "/")
@CrossOrigin //开启跨域
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.jianshen.bck.jianshenhomemanger"})
//@SpringBootApplication
public class JianshenHomeMangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianshenHomeMangerApplication.class, args);
    }

    @ApiOperation(value="欢迎页面", notes="显示欢迎页面")
    @GetMapping(value={"/","/index","welcome"})
    public String index() {
        System.out.println("hello");
        return "hello";
    }


    //===================SwaggerUI声明：=====================
    //  访问 http://localhost:8080/swagger-ui.html 即可
    //======================================================


}

