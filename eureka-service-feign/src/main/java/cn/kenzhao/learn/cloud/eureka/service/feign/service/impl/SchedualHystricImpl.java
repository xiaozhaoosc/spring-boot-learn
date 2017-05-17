package cn.kenzhao.learn.cloud.eureka.service.feign.service.impl;

import cn.kenzhao.learn.cloud.eureka.service.feign.service.SchedualDemoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kenzh on 2017/5/17.
 */
@Component
public class SchedualHystricImpl implements SchedualDemoService {
    @Override
    public String sayHelloClientOne(@RequestParam(value = "name") String name) {
        return "hi,"+name+",sorry,error!";
    }
}
