public class Employee{
    int empno;
    String name;
    double basic;

   // @Override
   // public final String toString(){
  //      return "empno" + empno + "name" + name + "salary" + newbasic;
   // }
     
     public static void main(String []args){
         Employee e1= new Employee();
         e1.empno=1;e1.name="bhaskar";e1.basic=50000;
         Employee e2= new Employee();
         e2.empno=2;e2.name="pavan";e2.basic=60000;
         Employee e3= new Employee();
         e3.empno=3;e3.name="krishna";e3.basic=70000;
         Employee [] arr=new Employee[]{e1,e2,e3};
         for(Employee e:arr){
             System.out.println(e.empno+" "+e.name +" "+e.basic);
             //System.out.println(e);
         } 
     }
}