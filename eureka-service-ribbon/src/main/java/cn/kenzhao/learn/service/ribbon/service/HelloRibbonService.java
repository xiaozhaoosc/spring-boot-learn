package cn.kenzhao.learn.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kenzh on 2017/5/17.
 */
@Service
public class HelloRibbonService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 调用eureka-demo中的服务/demo
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String demoService(String name){
        //调用service-demo的方法,并且在调用的工程中写服务的名称而不是具体的ip.
        return restTemplate.getForObject("http://SERVICE-DEMO/demo?name="+name,String.class);
    }

    /**
     * 断路器 -中断错误提示
     * @param name
     * @return
     */
    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
