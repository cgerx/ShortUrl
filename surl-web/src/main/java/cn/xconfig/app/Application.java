package cn.xconfig.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/12 21:31
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"cn.xconfig"})
@MapperScan(value = "cn.xconfig.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
