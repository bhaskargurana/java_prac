package com.hexaware.ftp113.persistence;
import org.skife.jdbi.v2.DBI;
public class DbConnection{
    public final DBI getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DBI dbi= new DBI("jdbc:mysql://localhost:3306/sql_practice?useSSL=false","root","Password123");
            System.out.println("connected...");
            return dbi;
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}