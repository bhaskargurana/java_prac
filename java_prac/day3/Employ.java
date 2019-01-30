import java.util.Objects;
//

public class Employ{
    int empno;
    String name;
    double basic;
    @Override
    public final int hashCode(){
        return Objects.hash(empno,name,basic);
    }
    @Override
    public final String toString(){
      return " empno " + empno + " name " + name + " salary " + basic;
    }

    public static void main(String [] args){
        Employ e1=new Employ();
        Employ e2=new Employ();
        e1.empno=1;
        e1.name="bhaskar";
        e1.basic=50000;
        e2.empno=1;
        e2.name="bhaskar";
        e2.basic=50000;
        //Employ [] arr=new Employ[]{e1,e2};
        // for(Employ e:arr){
            // System.out.println(e.empno+" "+e.name +" "+e.basic);
             System.out.println(e1);
             System.out.println(e2);
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        }

}