package com.mego.fallback;

import org.springframework.stereotype.Component;

import com.mego.service.FeignService;
import com.miicrown.entity.User;

/**
 * Created by cong on 2018/5/17.
 */
@Component
public class FeignFallBack implements FeignService {
	/*实现的方法是服务调用的降级方法*/
    @Override
    public String hello() {
        return "error1";
    }

    @Override
    public String hello(String name) {
        return "error2";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error3";
    }
}
