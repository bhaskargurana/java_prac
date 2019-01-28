import java.util.Scanner;
public class Posneg{


    public void check(int n){
        if (n>0){
                System.out.println("positive number");
        }
        else
        {
                System.out.println("negative number");

         }
    }
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        Posneg obj=new Posneg();
        obj.check(n);

    }
}