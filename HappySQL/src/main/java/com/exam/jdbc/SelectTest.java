package com.exam.jdbc;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:mysql://localhost/examplesdb";
        String user = "hwan";
        String password = "hwan1487";

        try {
//            3. 접속
            conn = DriverManager.getConnection(dbUrl, user, password);
//            4. 쿼리 작성
            ps = conn.prepareStatement("select deptno, dname, loc from dept");
//            5. 쿼리 실행
            rs = ps.executeQuery();
//            6. 결과 얻어냄
            while (rs.next()) {
                System.out.print(rs.getInt("deptno") + "  ");
                System.out.print(rs.getString(2) + "  ");
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
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
