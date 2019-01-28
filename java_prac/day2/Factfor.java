import java.util.Scanner;
public class Factfor{
    public void calc(int n){
for (int i=1;i<=n;i++){
    if(n%i==0){

        System.out.println("factors is"+i);
        }
}
        }


    public static void main(String[] args){
        int n;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Factfor obj=new Factfor();
        obj.calc(n);
    }
}