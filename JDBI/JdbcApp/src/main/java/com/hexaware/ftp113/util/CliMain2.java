package com.hexaware.ftp113.util;
import com.hexaware.ftp113.model.Dept;

public class CliMain2 {
  public static void main(final String[] ar) {
    Dept[] dept = Dept.listAll();
    for (Dept e : dept) {
      System.out.println(e.getDeptno() + " " +
             e.getDname() + " " + e.getLoc());
    }
  }
}