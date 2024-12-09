package com.example.demo.ws;

import com.example.demo.bean.Sms;
import com.example.demo.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sms/")

public class SmsWs {

    @Autowired
    private SmsService smsService;


    @PostMapping("send")
    public void sendSms(@RequestBody Sms sms) {
        smsService.sendSms(sms);

    }
}
