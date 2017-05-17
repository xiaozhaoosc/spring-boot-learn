package cn.kenzhao.learn.eureka.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kenzh on 2017/5/16.
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/demo")
    public String demo(@RequestParam String name){
        return "hi " + name + ", i am from prot:" + port;
    }
}
