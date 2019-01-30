public class Contest{
    int a,b;
    public Contest(){
        a=5;
        b=6;
    }
    
    public Contest(int a){
        this.a=a;
        b=6;
    }
    public Contest(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public final String toString(){
        return "a value " +a+ "\n b value " +b;
    }
    public static void main(String [] args){
        Contest obj1=new Contest();
        System.out.println(obj1);
        
    }
}