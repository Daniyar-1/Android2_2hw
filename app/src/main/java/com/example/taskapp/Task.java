package com.example.taskapp;

import java.io.Serializable;

public class Task implements Serializable {
    String title;
    String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Task(String title, String description) {
        this.title = title;
        this.desc = description;

    }
}
