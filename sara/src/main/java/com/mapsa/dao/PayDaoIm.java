package com.mapsa.dao;

import com.mapsa.model.Pay;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PayDaoIm  implements  PayDao{
   @Autowired
SessionFactory sessionFactory;

    @Override
    public void insertPay(Pay pay) {
        Session session = sessionFactory.getCurrentSession();
        session.save(pay);



    }

    @Override
    public List<Pay> showPayAll() {
        Session session = sessionFactory.getCurrentSession();
        Query from_pay_ = session.createQuery("from Pay ");
        List<Pay> list = from_pay_.list();

        return list;
    }

    
}
