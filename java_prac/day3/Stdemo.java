public class Stdemo{
    public void show(){
        System.out.println("from show method");
    }
    public static void display(){
        System.out.println("from display method");
    }
    public static void main(String [] args){
        Stdemo.display();
        new Stdemo().show();
    }
}