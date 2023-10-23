package net.hifor.demo.controller;

import net.hifor.demo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IKin <br/>
 * @description 第一个springboot  <br/>
 * @date 2019/11/17 <br/>
 */
@RestController
public class HelloSpringbootController {

    @DubboReference(url = "dubbo://127.0.0.1:20881")
    private UserService userService;

    /**
     * 第一个方法
     * @return
     */
    @GetMapping("/")
    public String hello() {
        return userService.getUserName("dubbo");
    }

    @RequestMapping("/user/{name}")
    public String getUser(@PathVariable("name") String name) {
        return userService.getUserName(name);
    }
}
