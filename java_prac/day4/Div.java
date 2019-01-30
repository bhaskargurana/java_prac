import java.util.Scanner;
import java.util.InputMismatchException;
public class Div{
    public static void main(String [] args){
        int a,b,c;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter 2 numbers");
        try{
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("division " +c);
        }catch (InputMismatchException e){
            System.out.println("only numbers");
        }
        catch(ArithmeticException e){
            System.out.println("division by zero impossible");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("program from ftp batch");
        }
    }
}