package com.fl.test;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.Key;

/**
 * Created by chenfeilong on 2017/10/9.
 */
public class PassWordTest {
    @Test
    public void Test(){

        AesCipherService aesCipherService = new AesCipherService();
        aesCipherService.setKeySize(128); //设置key长度
//生成key
        Key key = aesCipherService.generateNewKey();
        String text = "hello";
//加密
        String encrptText =  aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();

//解密
        String text2 = new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());
        System.out.println(encrptText+"====");
        System.out.println(text2+"-----");
        Assert.assertEquals(text, text2);
    }

}
