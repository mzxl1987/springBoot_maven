package com.mego.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mego.entity.MyException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class RestControllerOfAdvice {
	
    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map myErrorHandler(MyException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        
        log.error(ex.getMessage());
        
        return map;
    }
	
}
