package com.mego.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mego.entity.MyException;
import com.mego.entity.ViewException;

@ControllerAdvice
public class ControllerOfAdvice {

	private final String ERROR_VIEWPAGE = "error";
	
	/**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }
    
    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myErrorHandler(MyException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }
    
    /**
     * 页面异常捕捉
     * @param ex
     * @return
     */
    @ExceptionHandler(value = ViewException.class)
    public ModelAndView viewMyErrorHandler(HttpServletRequest request, MyException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(ERROR_VIEWPAGE);
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.addObject("code", ex.getCode());
        modelAndView.addObject("msg", ex.getMsg());
        return modelAndView;
    }
	
}
