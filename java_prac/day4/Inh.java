 class First{
     public int sum(){
         return 5;
     }
     public void show(){
         System.out.println("show from first class");
     }
 }
 class Second extends First{
     public int sum(){
         return 9;
     }
     public void display(){
         System.out.println("display from class second");
     }
 }
 public class Inh{
     public static void main(String [] args){
         Second obj=new Second();
         obj.show();
         obj.display();
         System.out.println(obj.sum());
     }
 }