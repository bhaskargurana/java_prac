class Demo1{
    public void show(){
        System.out.println("show from demo1");
    }
}
class Demo2 extends Demo1{
    public void show(){
        System.out.println("show from demo2");
    }
}
public class Sup1{
    public static void main(String [] args){
        Demo1 t= new Demo1();
        Demo1 obj1 =new Demo2();
        obj1.show();
        Demo2 obj= new Demo2();
        obj2.show();
        Demo1 obj3=(Demo1) new Demo2();
        obj3.show();
        Demo1 x=(Demo1)t;
        x.show();
        Demo2 y=(Demo1)x;
        y.show();
    }
}