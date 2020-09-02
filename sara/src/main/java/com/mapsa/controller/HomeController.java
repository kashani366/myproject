package com.mapsa.controller;

import com.mapsa.model.Pay;
import com.mapsa.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PayDao payDao;
    @RequestMapping ("/home")
    public  String  home(){
        Pay pay=new Pay();
        pay.setCardNumber("5859831081366915");
        pay.setCvv2("768");
        pay.setSecendPasword("1234");
        pay.setMonth("12");
        pay.setYear("1366");
        payDao.insertPay(pay);
        return "pay/index";


    }
    @RequestMapping("/")
    public  String page1(){
        return "page1";
    }
}
