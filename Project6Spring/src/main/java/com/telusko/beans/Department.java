package com.telusko.beans;

public class Department {
    private Integer depNo;
    private  String depName;

    @Override
    public String toString() {
        return "Department{" +
                "depNo=" + depNo +
                ", depName='" + depName + '\'' +
                '}';
    }

    public Department(Integer depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;
        System.out.println("Departement Bean - Constructor injection");
    }
}
