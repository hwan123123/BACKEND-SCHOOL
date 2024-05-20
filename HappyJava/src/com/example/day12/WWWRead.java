package com.example.day12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WWWRead {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.likelion.net/");
        InputStream urlInput = url.openStream();

        //URL에서 한 줄 씩 입력 받아서 출력해보세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(urlInput));
        String msg = null;
        while ((msg = br.readLine()) != null) {
            System.out.println(msg);
        }
//        String msg = br.readLine();
//        System.out.println(msg);
    }
}
