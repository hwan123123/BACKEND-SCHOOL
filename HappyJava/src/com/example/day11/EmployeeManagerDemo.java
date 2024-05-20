package com.example.day11;

import java.util.HashSet;
import java.util.Objects;

class Employee {
    private String name;
    private String id;
    private String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + "'";
    }
}

class EmployeeManager {
    HashSet<Employee> employees;

    public EmployeeManager() {
        this.employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
            System.out.println("사원 추가 : " + employee);
        } else {
            System.out.println("이미 존재하는 사원입니다.");
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("사원 삭제 : " + employee);
        } else {
            System.out.println("해당 사원은 존재하지 않습니다.");
        }
    }

    public void findEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println("사원 검색 : " + employee);
                return;
            }
        }
        System.out.println("해당 아이디를 가진 사원은 존재하지 않습니다.");
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("홍길동", "E01", "HR"));
        manager.addEmployee(new Employee("김철수", "E02", "Marketing"));
        manager.addEmployee(new Employee("홍길동", "E01", "HR")); // 중복 추가 시도

        manager.findEmployee("E01");
        manager.removeEmployee(new Employee("홍길동", "E01", "HR"));
        manager.findEmployee("E01");
    }
}
