package com.yang.stompwebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yang
 */
@Controller
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView sayHello(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }

    /**
     * 在 hello 页面 webjars 包引入测试
     * @param request
     * @return
     */
    @RequestMapping(value = "/name", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> jsonTest() {
        Map<String, Object> map = new HashMap<>(2);
        System.out.println("test");
        map.put("name", "testJson");
        return map;
    }
}
