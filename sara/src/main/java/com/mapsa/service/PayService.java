package com.mapsa.service;

import com.mapsa.dao.PayDao;
import com.mapsa.model.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class PayService {
    @Autowired
    private PayDao payDao;
    public  void insert(String cardNumber,String secendPasword,String cvv2, String month,String year){
        Pay pay=new Pay();
        pay.setCardNumber(cardNumber);
        pay.setSecendPasword(secendPasword);
        pay.setCvv2(cvv2);
        pay.setMonth(month);
        pay.setYear(year);
        payDao.insertPay(pay);
    }
    public   List<Pay>  showAllPay(){
       return payDao.showPayAll();

        }
    }

