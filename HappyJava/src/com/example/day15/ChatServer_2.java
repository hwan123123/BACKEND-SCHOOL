package com.example.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ChatServer_2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            Map<String, PrintWriter> clients = new HashMap<>();
            System.out.println("채팅 서버가 활성화되었습니다.");

            while (true) {
                Socket socket = serverSocket.accept();
                new ChatThread2(socket, clients).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ChatThread2 extends Thread {
    private Socket socket;
    private String id;
    private Map<String, PrintWriter> clients;
    private Map<String, Integer> chatRooms = new HashMap<>();
    private Map<Integer, Set<String>> rooms = new HashMap<>();
    private BufferedReader in;
    private PrintWriter out;
    private int roomCount = 0;

    public ChatThread2(Socket socket, Map<String, PrintWriter> clients) {
        this.socket = socket;
        this.clients = clients;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            id = in.readLine().trim();

            while (clients.containsKey(id)) {
                out.println("오류 : 닉네임이 중복되었습니다. 다른 닉네임을 입력해주세요.");
                id = in.readLine().trim();
            }

            System.out.println(id + " 닉네임의 사용자가 연결되었습니다.");
            broadcast(id + " 닉네임의 사용자가 입장했습니다.");
            System.out.println(id + "'s IpAddress : " + socket.getInetAddress());

            String chatFunction;
            while ((chatFunction = in.readLine()) != null) {
                if ("/list".equalsIgnoreCase(chatFunction)) {
                    listRooms();
                } else if ("/create".equalsIgnoreCase(chatFunction)) {
                    createRoom();
                } else if (chatFunction.startsWith("/join ")) {
                    joinRoom(chatFunction);
                } else if ("/exit".equalsIgnoreCase(chatFunction)) {
                    exitRoom();
                } else {
                    broadcast(chatFunction);
                }
            }

            synchronized (clients) {
                clients.put(id, out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String msg = null;
        try {
            while ((msg = in.readLine()) != null) {
                if ("/bye".equalsIgnoreCase(msg)) {
                    System.out.println(id + " 닉네임의 사용자가 연결을 끊었습니다.");
                    break;
                }
                if (msg.indexOf("/whisper") == 0) {
                    whisperMsg(msg);
                } else {
                    broadcast(id + " : " + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            synchronized (clients) {
                clients.remove(id);
            }
            broadcast(id + "님이 채팅에서 나갔습니다.");

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void listRooms() {
        out.println("현재 운영 중인 채팅방");
        for (int roomId : rooms.keySet()) {
            out.println(roomId + "번 채팅방");
        }
    }

    private void createRoom() {
        synchronized (rooms) {
            rooms.put(++roomCount, new HashSet<>());
        }
        out.println(roomCount + "번 방이 생성되었습니다.");
    }

    private void joinRoom(String message) {
        String[] parts = message.split("\\s+");
        try {
            int roomId = Integer.parseInt(parts[1]);
            synchronized (rooms) {
                if (rooms.containsKey(roomId)) {
                    rooms.get(roomId).add(id);
                    chatRooms.put(id, roomId);
                    out.println(roomId + "번 방에 입장하였습니다.");
                } else {
                    out.println(roomId + "번 방을 찾을 수 없습니다.");
                }
            }
        } catch (NumberFormatException e) {
            out.println("방 번호를 확인 후 다시 입력해주세요.");
        }
    }

    private void exitRoom() {
        Integer roomId = chatRooms.get(id);
        if (roomId != null) {
            rooms.get(roomId).remove(id);
            chatRooms.remove(id);
            out.println(roomId + "번 방에서 퇴장하였습니다.");
        }
    }

    public void whisperMsg(String msg) {
        int firstSpaceIndex = msg.indexOf(" ");
        if (firstSpaceIndex == -1) {
            return;
        }

        int secondSpaceIndex = msg.indexOf(" ", firstSpaceIndex + 1);
        if (secondSpaceIndex == -1) {
            return;
        }

        String whisper = msg.substring(firstSpaceIndex + 1, secondSpaceIndex);
        String message = msg.substring(secondSpaceIndex + 1);

        PrintWriter pw = clients.get(whisper);
        if (pw != null) {
            pw.println(id + "님에게 온 귓속말 : " + message);
        } else {
            System.out.println("귓속말 오류 : " + whisper + "님을 찾을 수 없습니다.");
        }
    }

    public void broadcast(String msg) {
        synchronized (clients) {
            Iterator<PrintWriter> iterator = clients.values().iterator();
            while (iterator.hasNext()) {
                PrintWriter pw = iterator.next();
                try {
                    pw.println(msg);
                } catch (Exception e) {
                    iterator.remove();
                    e.printStackTrace();
                }
            }
        }
    }
}