package com.hexaware.ftp113.util;
import java.util.Scanner;
import com.hexaware.ftp113.model.Employee;

public class CliMainInsert{
    public static void main(final String []ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employ no");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.println("enter name ");
        String name =sc.nextLine();
        System.out.println("enter dept ");
        String dept = sc.nextLine();
        System.out.println("enter desig");
        String desig =sc.nextLine();
        System.out.println("enter basic ");
        int basic =Integer.parseInt(sc.nextLine());
        Employee.insertEmp(empno,name,dept,desig,basic);
        System.out.println("record inserted");

    }
}