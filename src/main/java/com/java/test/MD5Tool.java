package com.java.test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Tool {
    private static final String[] arr={"0","1","2","3","4","5","6","7","8","9","z","x","c","v","b","n",};
    @Test
    public void testMD5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String s="123456";
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(s.getBytes("UTF-8"));
        StringBuffer miWen = new StringBuffer("");
        for (byte b : bytes) {
            int temp=b;
            if(temp<0){
                temp+=256;
            }
            int index1=temp/16;
            int index2=temp%16;
            miWen.append(arr[index1]);
            miWen.append(arr[index2]);
        }
        System.out.println(miWen);
    }
}
