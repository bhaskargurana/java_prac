import java.util.Scanner;
public class Even{
    public void show(int n){
        int i=0;
        while(i<=n){
            i=i+2;
            System.out.println("even is"+i);
        }
    }


    public static void main(String[] args){
        int n;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Even obj=new Even();
        obj.show(n);
    }
}