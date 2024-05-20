package com.example.day12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTypeIOExample {
    public static void main(String[] args) {
        //입,출력되는 데이터는 모두 바이트거나 캐릭터로 전송되는... 이것을
        //자바의 데이터 타입으로 읽고 쓰고 싶다.  //DataInputStream,  DataOutputStream
        try (
                FileOutputStream fos = new FileOutputStream("data.txt");
                DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeBoolean(true);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('a');
            dos.writeDouble(1.1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
