package com.exam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
//        1. 필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;

        try {
//        3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/examplesdb";
            String user = "hwan";
            String password = "hwan1487";
            conn = DriverManager.getConnection(dbUrl,user,password);
            conn.setAutoCommit(false);
//        4. 쿼리 작성
            String sql = "insert into dept(deptno,dname,loc) values(80,?,?)";
//            String sql = "update dept set loc = '부산' where deptno = 50";
//            String sql = "delete from dept where deptno = 50";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"경리부");
            ps.setString(2,"일산");
//        5. 실행
            int count = ps.executeUpdate();
            System.out.println(count+"insert success!");

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//        2. 닫아준다.
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
