package net.hifor.demo.service.impl;

import net.hifor.demo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * <p>  </p>
 *
 * @author KDev <br/>
 * @date 2023/8/1 <br/>
 */
// 注册组件：使用Dubbo尽量不是使用@Service
@Component
// Dubbo注册：项目启动时，自动注册到注册中心
@DubboService
// 实现公共接口UserService，通过公共模块依赖引入
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        return "provider :: hello " + name;
    }
}
