package com.hexaware.ftp113.model;
import com.hexaware.ftp113.persistence.DbConnection;
import com.hexaware.ftp113.persistence.DeptDAO;
import java.util.List;

public class Dept{
    private int deptno;
    private String dname;
    private String loc;
    public Dept(int argDeptno,
                    String argDname,
                    String argLoc
                    )
{
 this.deptno= argDeptno;
 this.dname= argDname;
 this.loc= argLoc;
}
public  final int getDeptno(){
    return deptno;
}
public final void setDeptno(final int argDeptno){
    this.deptno=argDeptno;
}
public final String getDname(){
    return dname;
}
public final void setDname(final String argDname){
    this.dname=argDname;
}
public final String getLoc(){
    return loc;
}
public final void setDept(final String argLoc){
    this.loc=argLoc;
}

private static DeptDAO dao(){
    DbConnection db= new DbConnection();
    return db.getConnect().onDemand(DeptDAO.class);
}
public static Dept[] listAll(){
    List<Dept> es= dao().list();
    return es.toArray(new Dept[es.size()]);
}

}