public class Customer{
    int custId;
    String cname;
    double billAmt;

    @Override 
    public final String toString(){
        return " cust ID " +custId+ " name "+ cname+" cost "+billAmt;
    }
        public void show(Object ob){
            Customer c1=(Customer)ob;
            System.out.println(c1);
        }
        public static void main(String [] args){
            Customer c1= new Customer();
            c1.custId =1 ;
            c1.cname="bhaskar";
            c1.billAmt=4564;
            c1.show(c1);
        }
            
}