package com.ncu800116240.liaozeming;
/*
名称：期中综合测试
时间：2019年5月10日 13:50 - 15:25
地点：软件楼422
学号：8000116240
姓名：廖泽铭
班级：软件工程168班
*/

import java.util.Date;

public class textBean {
    private int id;
    private String title;
    private String Context;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    public textBean(int id, String title, String context, String date) {
        this.id = id;
        this.title = title;
        Context = context;
        this.date = date;
    }
}
