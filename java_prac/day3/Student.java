public class Student{
    private int stuid;
    private String name;
    private double cgpa;
    public int getStuid(){
        return stuid;
    }
    
    public void setStuid(int stuid){
        this.stuid=stuid;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
    @Override
    public final String toString(){
        return "stuid" +stuid+" name "+ name+" cgpa "+cgpa;
    }
    public static void main(String [] args){ 
        Student obj=new Student();
        obj.setStuid(465);
        obj.setName("bhaskar");
        obj.setCgpa(8.68);
        System.out.println(obj);
    }
}


