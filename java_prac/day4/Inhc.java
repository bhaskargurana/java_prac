class C1{
    static{
        System.out.println("static from c1");
    }
    public C1(){
        System.out.println("base class constructor");
    }

}
class C2 extends C1 {
    static{
        System.out.println("static from c2");
    }
    public C2(){
        System.out.println("derived class constructor");
    }
}
public class Inhc{
    public static void main(String[] args){
C2 obj=new C2();
    }
}