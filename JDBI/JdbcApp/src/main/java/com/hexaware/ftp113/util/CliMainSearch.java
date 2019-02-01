package com.hexaware.ftp113.util;
import java.util.Scanner;
import com.hexaware.ftp113.model.Employee;
public class CliMainSearch{
    public static void main(String [] args){
        int empno;
        System.out.println("enter emp no");
        Scanner sc= new Scanner(System.in);
        empno= sc.nextInt();
        Employee e=Employee.listById(empno);
        if(e != null){
            System.out.println("name "+e.getName());
            System.out.println("Dept "+e.getDept());
            System.out.println("desig "+e.getDesig());
            System.out.println("Basic "+e.getBasic());
        }
        else{
            System.out.println("record not found");
        }
    }
}