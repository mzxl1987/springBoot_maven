package com.mego.fallback;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import com.mego.service.FeignService;

/**
 * Created by cong on 2018/5/17.
 */
@Component
public class FeignFallBack implements FeignService {
	/*实现的方法是服务调用的降级方法*/
    public String hello() {
        return "error1";
    }

    public String hello(String name) {
        return "error2";
    }

    public User hello(String name, Integer age) {
        return new User();
    }

    public String hello(User user) {
        return "error3";
    }
}
