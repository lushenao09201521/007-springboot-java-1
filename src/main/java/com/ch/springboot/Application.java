package com.ch.springboot;

import com.ch.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class Application implements CommandLineRunner {
public class Application {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
//    //获取SpringBoot容器
//    ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
//    //从spring容器中获取指定bean对象
//    StudentService studentService= (StudentService) run.getBean("studentServiceImpl");
//    //调用业务方法
//      String  sayHello=studentService.sayHello();
//        System.out.println(sayHello);
    }
    //重写CommandLineRunner类中的run方法
//    @Override
//    public void run(String... args) throws Exception {
//    String sayHello=studentService.sayHello2("SpringBoot");
//        System.out.println(sayHello);
//    }

}
