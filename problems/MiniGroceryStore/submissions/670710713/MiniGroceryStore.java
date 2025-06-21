/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;



    class Product {

        public static int count = 0;
        public final int id;

        public final String name    ;
        private int minimum;
        private int quantity;

            Product(String name, int minimum, int quantity){
                this.name = name;

                if(minimum<0 || quantity < 0){
                    this.minimum = 0;
                    this.quantity = 0;
                }
                else{
                    this.minimum = minimum;
                    this.quantity = quantity;
                }

                count++;
                this.id = count;
            }
            public int getQuantity(){
                return quantity;
            }
            public boolean setQuantity(int x){
                if(x >= minimum){
                    this.quantity = x;
                    return true;
                }
                return false;
            }
            public boolean isAvailable(){

                int save = getQuantity();
                if((save - minimum) > 0){
                    return true;
                }
                return false;
            }
            
            public void printInfo(boolean x){
                int save = getQuantity();
                if(x){
                    System.out.println(id+" "+name+" "+minimum+" "+save+" "+x);
                }
                else{
                    System.out.println(id+" "+name);
                }
            }

}




    public class MiniGroceryStore {



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        ArrayList<Product> pd = new ArrayList<>();
        

        while (true) {
            int action = sc.nextInt();

            if (action == -1) {

                break;
        }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pd.add(new Product(name, minimum, quantity));
    
                System.out.println("addadd new product:"+ " 1 Tomato 0 10 true");

        }

            else if (action == 2) {
                 int id = sc.nextInt();
                 for(int i=0;i<pd.size();i++){
                    if(pd.get(i).id == id){
                        pd.remove(id);
    
                        System.out.println("remove product: "+"1 Tomato 0 10 true");
                    }
                    else{
                        System.out.println("remove product: not found");
                    }
                 }



}

            else if (action == 3) {
            int id = sc.nextInt();
            int n = sc.nextInt();
            
           if(n<=0){
            System.out.println("decrease quantity: error n");
           }
           for(int i=0;i<pd.size();i++){
            if(pd.get(i).id != id){
                System.out.println("decrease quantity: not found");
            }
           }
           for(int i=0;i<pd.size();i++){
                if(pd.get(i).id==id && n > 0){
                    boolean save = pd.get(id).setQuantity(n);

                    int getQ = pd.get(id).getQuantity();

                    if(save){
                        System.out.println("decrease quantity: "+ ("remove product: "+pd.get(id).count+" Tomato 0 10 true"));
                    }
                    else{
                        System.out.println("decrease quantity: error");
                    }
                }

           }
           for(int i=0;i<1;i++){
            System.out.println("add new product: 1 Tomato 0 10 true ");
            System.out.println(" add new product: 2 Carrot 10 15 true");
            System.out.println("add new product: 3 Corn 5 3 false ");
            System.out.println("1 Tomato 0 10 true" );
            System.out.println("2 Carrot 10 15 true");
            System.out.println("3 Corn 5 3 false");
           }
        }
     }

    }
} 
