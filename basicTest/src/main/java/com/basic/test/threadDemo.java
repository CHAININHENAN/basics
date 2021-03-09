package com.basic.test;

/**
 * @author zhaopanfeng
 * @date 2020/12/16 9:26
 */
public class threadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());

        System.out.println(thread.getId());

        System.out.println(thread.getPriority());
    }
}
