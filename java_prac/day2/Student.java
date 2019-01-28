public class Student{
    int stu_id;
    String name;
    double cgpa; 
     @Override
   public final String toString(){
      return " stu_id " + stu_id + " name " + name + " cgpa " + cgpa;
 }
public static void main(String[] args){
    Student s1= new Student();
     s1.stu_id=465;s1.name="bhaskar";s1.cgpa=8.68;
     Student s2= new Student();
     s2.stu_id=466;s2.name="soma";s2.cgpa=8.50;
     Student s3= new Student();
     s3.stu_id=467;s3.name="jallu";s3.cgpa=8.60;
     Student [] arr=new Student[]{s1,s2,s3};
     for (Student s:arr){
        // System.out.println(s.stu_id+" "+s.name +" "+s.cgpa);
         System.out.println(s);
       }
    }
}
