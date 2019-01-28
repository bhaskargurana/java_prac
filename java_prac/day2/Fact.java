import java.util.Scanner;
public class Fact{
    public void calc(int n){
        int i=1,f=1;
        while(i<=n){
            f=f*i;
            i++;
        }
            System.out.println("factorial is"+f);
        
    }


    public static void main(String[] args){
        int n;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Fact obj=new Fact();
        obj.calc(n);
    }
}