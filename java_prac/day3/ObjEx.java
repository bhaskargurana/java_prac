public class ObjEx{
    public void show(Object ob){
        if(ob=="A"){
            System.out.println("hi");
        }
            else{
                System.out.println("bye");

            }
        }
        public static void main(String[]args){
            String ob="A";
            new ObjEx().show(ob);
        }
    }
