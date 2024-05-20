package com.exam.jdbc;

public class DeptDAORun {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        DeptDTO deptDTO = new DeptDTO();
        deptDTO.setDeptno(60);
        deptDTO.setDname("총무부");
        deptDTO.setLoc("대전");
//        boolean resultFlag = deptDAO.addDept(deptDTO);
//        if (resultFlag) {
//            System.out.println("입력 성공!");
//        } else {
//            System.out.println("입력 실패!");
//        }
//        int resultCount = deptDAO.updateDept(deptDTO);
//        System.out.println(resultCount);

        deptDAO.getDept(80);
    }
}
