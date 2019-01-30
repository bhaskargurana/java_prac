public class Agent{
    private int agentid;
    private String firstName;
    private String lastName;
    private String city;
    private double premium;

public Agent(){

}
public Agent(int argAgentid,
             String argFirstName,
             String argLastName,
             String argCity,
             double argPremium){
    this.agentid=argAgentid;
    this.firstName=argFirstName;
    this.lastName=argLastName;
    this.city=argCity;
    this.premium=argPremium;
 }
 public int getAgentid(){
     return agentid;
 }
 public void setAgentid(int argAgentid){
     this.agentid=argAgentid;
 }
 public String getFirstName(){
     return firstName;
 }
 public void setFirstName(String argFirstName){
    this.firstName=argFirstName;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String argLastName){
   this.lastName=argLastName;
}
public String getCity(){
    return city;
}
public void setCity(String argCity){
   this.city=argCity;
}
public double getPremium(){
    return premium;
}
public void setPremium(double argPremium){
    this.premium=argPremium;
}
@Override
    public final String toString(){
        return "agentid"+agentid+"first name"+firstName+"last name"+lastName+"city"+city+"premium"+premium;
    }
public static void main(String [] args){
    Agent obj=new Agent();
    obj.setAgentid(1234);
    obj.setFirstName("bhaskar");
    obj.setLastName("gurana");
    obj.setCity("vizag");
    obj.setPremium(200000.00);
    System.out.println(obj);
    }
}


