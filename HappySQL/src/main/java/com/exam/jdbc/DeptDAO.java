package com.exam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DeptDAO {
    //    입력
    public boolean addDept(DeptDTO deptDTO) {
//        매개변수로 받아올 값이 너무 많아요.. 그럴 때 어떻게??
//        가방처럼 값을 담을 객체를 만들어서 사용함.
//        VO  ,  DTO (DeptDTO)  , Model (Dept)  , Entity (Dept
//        1. 필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;
        boolean resultflag = false;

        try {
//        3. 접속
            conn = DBUtil.getConnection();

//        4. 쿼리 작성
            String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, deptDTO.getDeptno());
            ps.setString(2, deptDTO.getDname());
            ps.setString(3, deptDTO.getLoc());
//        5. 실행
            int count = ps.executeUpdate();
            System.out.println(count + "건 입력했습니다.");

            if (count > 0) {
                resultflag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//        2. 닫아준다.
            DBUtil.close(conn, ps);
        }
        return resultflag;
    }

    //    수정
    public int updateDept(DeptDTO deptDTO) {
        Connection conn = null;
        PreparedStatement ps = null;
        int resultcount = 0;

        try {
//        3. 접속
            conn = DBUtil.getConnection();
//        4. 쿼리 작성
            String sql = "update dept set dname=?, loc=? where deptno=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, deptDTO.getDname());
            ps.setString(2, deptDTO.getLoc());
            ps.setInt(3, deptDTO.getDeptno());
//        5. 실행
            resultcount = ps.executeUpdate();
            System.out.println(resultcount + "건 수정했습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//        2. 닫아준다.
            DBUtil.close(conn, ps);
        }

        return resultcount;
    }

    //    삭제
    public void deleteDept(int deptno) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement("delete from dept where deptno=?");
            ps.setInt(1, deptno);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps);
        }

    }

    //    한 건 조회
    public DeptDTO getDept(int deptno) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DeptDTO deptDTO = null;

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement("select * from dept where deptno=?");
            ps.setInt(1, deptno);
            rs = ps.executeQuery();

            if (rs.next()) {
                deptDTO = new DeptDTO();
                System.out.print(rs.getInt("deptno") + "  ");
                System.out.print(rs.getString("dname") + "  ");
                System.out.print(rs.getString("loc"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return deptDTO;
    }


    //    모두 조회
    public List<DeptDTO> getAllDept() {
        return null;
    }
//    조건에 맞는 조회
}
