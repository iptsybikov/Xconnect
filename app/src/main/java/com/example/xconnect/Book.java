package com.example.xconnect;



public class Book {


    private String action;
    private String cctv;
    private String date;
    private String name;
    private String number;
    private String phone;
    public Book() {
    }


    public Book(String action, String cctv, String date, String name, String number, String phone) {
        this.action = action;
        this.cctv = cctv;
        this.date = date;
        this.name = name;
        this.number = number;
        this.phone = phone;
    }

    public String getaction() {
        return action;
    }

    public void setaction(String action) {
        this.action = action;
    }

    public String getcctv() {
        return cctv;
    }

    public void setcctv(String cctv) {
        this.cctv = cctv;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getnumber() {
        return number;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }
}

