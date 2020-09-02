package com.mapsa.dao;

import com.mapsa.model.Pay;

import java.util.List;

public interface PayDao {
    public  void  insertPay(Pay pay) ;
public List<Pay> showPayAll();



}
