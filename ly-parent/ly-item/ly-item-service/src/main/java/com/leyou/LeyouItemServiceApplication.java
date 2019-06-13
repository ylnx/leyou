package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 描述:
 *
 * @author liaox
 * @create 2019-06-10 16:32
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.leyou.item.mapper")
public class LeyouItemServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(LeyouItemServiceApplication.class);
    }
}
