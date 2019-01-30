class Employ{
    int empno;
    String name;
    double basic;
    public Employ(int empno,String name,double basic){
        this.empno=empno;
        this.name=name;
        this.basic=basic;
    }
    @Override
    public final String toString(){
        return "empno "+empno+" name "+name+" basic " +basic;
    }
}
    class Bhaskar extends Employ{
        public Bhaskar(int empno,String name,double basic){
            super(empno,name,basic);
        }
    }
    public class Supdemo{
        public static void main(String [] args){
            Employ obj = new Bhaskar(1,"bhaskar",13223);
            System.out.println(obj);
        }
    }

