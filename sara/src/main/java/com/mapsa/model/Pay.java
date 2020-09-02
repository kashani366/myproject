package com.mapsa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   int id;

    String cardNumber;
    String cvv2;
    String month;
    String year;
    String secendPasword;

    public void setId(int id) {
        this.id = id;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSecendPasword(String secendPasword) {
        this.secendPasword = secendPasword;
    }

    public int getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv2() {
        return cvv2;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getSecendPasword() {
        return secendPasword;
    }
}
