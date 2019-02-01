package com.hexaware.ftp113.util;
import com.hexaware.ftp113.model.Employee;

public class CliMain {
  public static void main(final String[] ar) {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e.getEmpno() + " " +
             e.getName() + " " + e.getDept() + " "
              + e.getDesig() + " " + e.getBasic());
    }
  }
}
