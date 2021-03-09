package com.basic.test;

import java.io.*;

/**
 * @author zhaopanfeng
 * @date 2020/12/28 15:07
 */
public class BufferDemo1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
           reader = new BufferedReader(new FileReader("a.txt"));
           String read;
           while((read = reader.readLine())!= null){
               System.out.println(read);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
