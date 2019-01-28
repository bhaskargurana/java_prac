import java.util.Scanner;


public class CtoF{
public void calc(double c){
    double f;
    f=((9*c)/5)+32;
    System.out.println("fahrenheit value" +f);
}
    public static void main(String[] args)
    {
    double c;
    System.out.println("enter the centigrade value");
    Scanner sc= new Scanner(System.in);
    c=sc.nextDouble();
    CtoF obj=new CtoF();
    obj.calc(c);
    }
}

