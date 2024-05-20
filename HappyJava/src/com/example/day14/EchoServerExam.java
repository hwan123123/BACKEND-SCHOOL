package com.example.day14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerExam {
    public static void main(String[] args) throws Exception {
        //1. ServerSocket 생성
        ServerSocket server = new ServerSocket(10001);
        System.out.println("서버가 준비되었습니다.");

        //2. 클라이언트 연결 수락
        Socket sock = server.accept();
        System.out.println(sock.getInetAddress().getHostName() + "로부터 연결되었습니다.");

        //3. 데이터를 읽고 쓰기
        //입력통로
        //클라이언트의 출력이 서버의 입력이 된다.
//        sock.getOutputStream();   클라이언트의 출력
        InputStream in = sock.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        //출력통로
        OutputStream out = sock.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println("클라이언트에서 받은 메시지 : " + line);

            //클라이언트가 보낸 메시지를 그대로 다시 클라이언트에게 보낸다.
            pw.println(line);
            pw.flush();
        }

        pw.close();
        br.close();
    }
}
