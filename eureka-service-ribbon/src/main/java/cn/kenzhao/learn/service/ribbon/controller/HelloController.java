package cn.kenzhao.learn.service.ribbon.controller;

import cn.kenzhao.learn.service.ribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kenzh on 2017/5/17.
 */
@RestController
public class HelloController {
    @Autowired
    HelloRibbonService helloRibbonService;

    @RequestMapping("/demo")
    public String demo(@RequestParam String name){
        return helloRibbonService.demoService(name);
    }
}
