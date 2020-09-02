package com.mapsa.controller;

import com.mapsa.model.Pay;
import com.mapsa.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pay")
public class PayController {
    String message;

    @Autowired
  private   PayService payService;
    @RequestMapping
    public String show(){
        return "pay/index";

    }

    @PostMapping("/insert")
    public ModelAndView insert(@RequestParam String cardNumber,
                               @RequestParam String secendPasword ,
                               @RequestParam String cvv2,
                               @RequestParam String month,
                               @RequestParam String year
                               ){
        payService.insert(cardNumber,secendPasword,cvv2,month,year);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pay/index");
        mv.addObject("message" , "insert anjamshod");
        return mv;
    }
@RequestMapping("showPay")
    public  String showAll(Model model){
    List<Pay> pays = payService.showAllPay();
    model.addAttribute("pays",pays);
    return  "pay/showPay";
}

}
