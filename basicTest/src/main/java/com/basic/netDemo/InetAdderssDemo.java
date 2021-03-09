package com.basic.netDemo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhaopanfeng
 * @date 2021/1/18 20:40
 */
public class InetAdderssDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local);
        InetAddress inet = InetAddress.getByName("DESKTOP-K0EO0TH");
        System.out.println(inet);
    }
}
