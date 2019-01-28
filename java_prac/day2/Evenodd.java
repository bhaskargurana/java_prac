import java.util.Scanner;
public class Evenodd{
public void check(int n){
        if (n%2==0){
                System.out.println("even number");
        }
        else {
                System.out.println("odd number");
        }
}
public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        Evenodd obj=new Evenodd();
        obj.check(n);
    }
}