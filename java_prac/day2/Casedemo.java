import java.util.Scanner;
public class Casedemo{
public static void show(int n){
    switch(n){
        case 1 : System.out.println("unix");
                 break;
        case 2 : System.out.println("java");
                 break;
        case 3 : System.out.println("GIT");
    default :
             System.out.println("invalid option");
             break;
    }
}
public static void main(String[] args){
        int n;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Casedemo obj=new Casedemo();
        obj.show(n);
    }
}

