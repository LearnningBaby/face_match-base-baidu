package com.example.face.FaceTest;

import com.example.face.service.FaceService;
import com.example.face.util.Base64Util;
import com.example.face.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class Test {
    @Autowired
    @Qualifier("FaceServiceImpl")
    private FaceService faceService;

    @org.junit.jupiter.api.Test
    public void test01(){
        boolean sameByPath = faceService.isSameByPath("D:\\Users\\zdz\\Pictures\\个人证件照.jpg", "D:\\Users\\zdz\\Pictures\\个人证件照.jpg");
        System.out.println(sameByPath);

    }

    @org.junit.jupiter.api.Test
    public void test02() throws IOException {
        byte[] bytes1 = FileUtil.readFileByBytes("D:\\Users\\zdz\\Pictures\\个人证件照.jpg");
        String encode1 = Base64Util.encode(bytes1);

        byte[] bytes2 =FileUtil.readFileByBytes("D:\\Users\\zdz\\Pictures\\个人证件照.jpg");
        String encode2 = Base64Util.encode(bytes2);
        boolean sameByBase64 = faceService.isSameByBase64(encode1, encode2);
        System.out.println(sameByBase64);
    }

    @org.junit.jupiter.api.Test
    public void test03() throws IOException {

        byte[] bytes2 =FileUtil.readFileByBytes("D:\\Users\\zdz\\Pictures\\个人证件照.jpg");
        String encode2 = Base64Util.encode(bytes2);

        boolean sameByBase64AndPath = faceService.isSameByBase64AndPath(encode2, "D:\\Users\\zdz\\Pictures\\个人证件照.jpg");
        System.out.println(sameByBase64AndPath);
    }
}
