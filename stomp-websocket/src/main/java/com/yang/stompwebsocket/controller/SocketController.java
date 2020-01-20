package com.yang.stompwebsocket.controller;

import com.yang.stompwebsocket.bean.Greeting;
import com.yang.stompwebsocket.bean.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    /**
     * 简单测试SimpMessagingTemplate的用法
     */
    @PostMapping("/greeting")
    @ResponseBody
    public Map<String, Object> greeting(@RequestBody Greeting greeting) {
        this.messagingTemplate.convertAndSend("/topic/greeting", new HelloMessage("通知," + greeting.getName() + "!"));
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ok");
        return map;
    }
}
