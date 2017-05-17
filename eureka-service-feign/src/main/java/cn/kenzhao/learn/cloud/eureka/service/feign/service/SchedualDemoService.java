package cn.kenzhao.learn.cloud.eureka.service.feign.service;

import cn.kenzhao.learn.cloud.eureka.service.feign.service.impl.SchedualHystricImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kenzh on 2017/5/17.
 */
@FeignClient(value = "service-demo", fallback = SchedualHystricImpl.class)
public interface SchedualDemoService {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    String sayHelloClientOne(@RequestParam(value = "name") String name);
}
