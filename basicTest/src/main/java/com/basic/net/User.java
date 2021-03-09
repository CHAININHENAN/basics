package com.basic.net;

import java.io.Serializable;

/**
 * @author zhaopanfeng
 * @date 2021/1/19 9:24
 */
public class User implements Serializable {

    private static final long serialVersionUID = 8504302884551508651L;

    private  String userName;
    private  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
