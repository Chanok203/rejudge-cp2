/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
import java.util.ArrayList;
    class Product {
        public static int count=0;
        public static final int id=0;
        public  String name;
        private int minimum;
        private int quantity;
        public Product(String name, int minimum, int quantity) {
            this.name = name;
            this.minimum = minimum;
            this.quantity = quantity;
        }
        public int getQuantity(){
            return quantity;
        }
        public boolean setQuantity(int n_quantity){
            if(n_quantity<minimum){
                
                return false;
            }
            else{
                this.quantity = n_quantity;
                return true;
            }
        }
        public void  isAvailable(){
            
        }

    }
    public class MiniGroceryStore{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while (true) {
    int action = sc.nextInt();
    // stop
    if (action == -1) {
        break;
    }
    // add
    else if (action == 1) {
    String name = sc.next();
    int minimum = sc.nextInt();
    int quantity = sc.nextInt();
    System.out.println("add new product: ");

    }
    // remove
    else if (action == 2) {
    int id = sc.nextInt(); 
        
    }
    // decrease quantity
    else if (action == 3) {
    int id = sc.nextInt();
    int n = sc.nextInt();
    if(id==0){
        System.out.println("decrease quantity: not found");
    }
    if(n<=0){
        System.out.println("decrease quantity: error n");
    }

    }
    }
    // TODO: write your code here
    }
    } 
