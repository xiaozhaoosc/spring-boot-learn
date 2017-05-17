package cn.kenzhao.learn.cloud.eureka.service.feign.controller;

import cn.kenzhao.learn.cloud.eureka.service.feign.service.SchedualDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kenzh on 2017/5/17.
 */
@RestController
public class DemoController {

    @Autowired
    SchedualDemoService schedualDemoService;

    @RequestMapping("/demo")
    public String sayHello(@RequestParam String name){
        return schedualDemoService.sayHelloClientOne(name);
    }
}
