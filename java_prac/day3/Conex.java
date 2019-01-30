public class Conex{
    static{
        System.out.println("static constructor");
    }
    Conex(){
        System.out.println("general constructor");

    }
    public static void main(String [] args){
        Conex obj=new Conex();
    }
}