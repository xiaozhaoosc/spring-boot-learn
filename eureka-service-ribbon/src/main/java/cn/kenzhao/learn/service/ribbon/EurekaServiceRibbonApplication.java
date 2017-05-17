package cn.kenzhao.learn.service.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class EurekaServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRibbonApplication.class, args);
	}

	@Bean //定义REST客户端，RestTemplate实例
	@LoadBalanced //开启负债均衡的能力
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
