package com.basic.test;

import java.io.CharArrayWriter;

/**
 * @author zhaopanfeng
 * @date 2020/12/17 11:50
 */
public class YieldTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
