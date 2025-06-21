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
        private String name;
        private int minimum;
        private int quantity;
        public int count = 0 ;
        public int id;
    
        public void Product(String name, int minimum, int quantity) {
            this.name = name;
            this.minimum = minimum;
            this.quantity = quantity;
        }

        public void getQuantity(){
            this.quantity = quantity;
        }
        return get.quantity;
        

        public void setQuantity(){

        }

        void printInfo() {
            System.out.println(name );
            System.out.println(minimum );
            System.out.println(quantity );
            System.out.println(count );
            System.out.println();
        }
    }


    public class MiniGroceryStore () private static int count;
    {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<MiniGroceryStore> product = new ArrayList<>();
    while (true) {
        int action = sc.nextInt();
        // stop
        if (action == -1) {

        }
        // add
        else if (action == 1) {
        String name = sc.next();
        int minimum = sc.nextInt();
        int quantity = sc.nextInt();
            product.add(name,minimum,quantity);
            System.out.println("add new product:"+ Product.add);
            
            count++;
            
        }
        // remove
        else if (action == 2) {
        int id = sc.nextInt();
        System.out.println("remove product: "  + Product.printInfo);
        }
        // decrease quantity
        else if (action == 3) {
        int id = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("decrease quantity: "  + Product.printInfo);
        }
    }
        sc.close();
    }
}
