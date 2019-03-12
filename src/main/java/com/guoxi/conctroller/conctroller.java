package com.guoxi.conctroller;

import com.guoxi.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conctroller {
    @Autowired
    MailServiceImpl mailService;


    @RequestMapping("/getmail")
    public String test(){
        mailService.sendSimpleMail("guoxi@risingstarinfo.com", "这是用springboot发送的邮件", "你好呀呀呀呀呀");
        return "success";
    }
}
