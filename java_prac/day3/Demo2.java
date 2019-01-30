public class Demo2{
    public int sum(){
        return 5;
    }
    public int sum(int x){
        return x+5;
    }
    public int sum(int x,int y){
        return x+y;

    }
    public static void main(String [] args){
        Demo2 obj = new Demo2();
        System.out.println("result " +obj.sum());
        System.out.println("result " +obj.sum(12));
        System.out.println("result " +obj.sum(7,22));
    }
}