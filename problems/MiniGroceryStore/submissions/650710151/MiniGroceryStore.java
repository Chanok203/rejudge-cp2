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
    // TODO: write your code here
        public int count =0;
        public int id;
        public static String name;
        private int minimum;
        private int quantity;
        boolean n=true;
                
     Product(String name,int minimum,int quantity){ 
            
        }
        public void getQuantity(){ 
          // return quantity;
            
        } 
        
        public void setQuantity(int n) {
            if(n<minimum){ 
            //    boolean n=false; 
            }
            else{
                quantity=0;
            //    boolean n=true;
            }
        }
        public void isAvailable(){ 

        }
        public void printlnfo( ){ 
           if(true){ 
            System.out.print(id );
            System.out.print(name );
            System.out.print(minimum );
            System.out.print(quantity );
            //vall isAvailable

           }else{ 
            System.out.print(id );
            System.out.print(name);
           }

        } 

   }
   public class MiniGroceryStore {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    


    while (true) {
    int action = sc.nextInt();
    // stop
    if (action == -1) {
    // TODO: write your code here

        break;

    }
    // add
    else if (action == 1) {
    String name = sc.next();
    int minimum = sc.nextInt();
    int quantity = sc.nextInt();

    // TODO: write your code here
    System.out.println("add new product:");
   


    }
    // remove
    else if (action == 2) {
    int id = sc.nextInt();
    // TODO: write your code here
    System.out.println("remove product: ");
    }
    // decrease quantity
    else if (action == 3) {
    int id = sc.nextInt();
    int n = sc.nextInt();
    // TODO: write your code here
     //   if(0){ 
            System.out.println("decrease quantity: not found");
       // }else if (n<=0) {
            System.out.println("decrease quantity:error n");
       // }else if(id=true && n=true){ 
            System.out.print("decrease quantity: ");

      //  }

    }
    }


    // TODO: write your code here
    }
   } 
   