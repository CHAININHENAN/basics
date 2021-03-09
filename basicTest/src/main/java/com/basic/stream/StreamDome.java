package com.basic.stream;

import java.util.stream.Stream;

/**
 * @author zhaopanfeng
 * @date 2021/1/25 16:08
 */
public class StreamDome {
    public static void main(String[] args) {
        String str = "11,22,33,44,55";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
    }
}
