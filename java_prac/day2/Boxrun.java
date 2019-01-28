public class Boxrun{
    public void show(Object ob){
        String s=ob.getClass().getSimpleName();
        System.out.println(s);
        if(s.equals("Integer")){
            System.out.println("Integer casting");
            int x=(Integer)ob;
        }
        if(s.equals("Double")){
            System.out.println("double casting");
            double y=(Double)ob;
        }
    }


    public static void main(String[] args){
        int x=23;
        double y=12.6;
        String name="Bhaskar";
        Boxrun obj=new Boxrun();
        obj.show(x);
        obj.show(y);
        obj.show(name);
    }
}
