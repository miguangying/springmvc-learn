package org.springframework.util.test;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/17.
 */
public class User implements Serializable {
    private String name;

    public User(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getStr(String str){
        return str;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
