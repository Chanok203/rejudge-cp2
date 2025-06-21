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
    public static int count = 0 ;
    public final int id ;
    public final String name ;
    private int minimum ;
    private int quantity ;

    Product(String name , int minimum , int quantity){
        this.name = name ;
        if(minimum < 0){
            this.minimum = 0 ;
        }
        else{
            this.minimum = minimum ;
        }
        if(quantity < 0){
            this.quantity = 0 ;
        }
        else{
            this.quantity = quantity ;
        }
        this.id = ++Product.count ;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if(quantity < minimum){
            return false ;
        }
        else{
            this.quantity = quantity;
            return true ;
        }
    }

    public boolean isAvailable(){
        if(minimum > quantity){ 
            return false ;
        }
        else{
            return true ;
        }
    }

    public void printInfo (boolean privateornot){
        if(privateornot){
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        }
        else{
            System.out.println(id + " " + name);
        }
    }

    // public void add(String name2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'add'");
    // }

    // public void add(int minimum2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'add'");
    // }

    

}

public class MiniGroceryStore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Product> products = new ArrayList<>() ;
        // int cnt = 0 ;
        // Product[] product = new Product[cnt] ;
        
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                return ;
            }
            // add
            else if (action == 1) {
                
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
        
                Product p = new Product(name, minimum, quantity) ;
                
                products.add(p) ;
                // products.add(minimum) ;
                // products.add(quantity) ; 
                
                // product[cnt] = new Product(name, minimum, quantity) ;

                System.out.print("add new product: ");
                p.printInfo(true);
                // cnt++ ;
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
                if(products.get(id) != null){
                    System.out.print("remove product: ");
                    products.remove(id) ;
                    products.get(id).printInfo(false);
                }
                else{
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here
                if(products.get(id) == null){
                    System.out.println("decrease quantity: not found");
                    return ;
                }
                if(n <= 0){
                    System.out.println("decrease quantity: error n");
                    return ;
                }
                else{
                    products.get(id).getQuantity() ;
                    if(products.get(id).setQuantity(n)){
                        System.out.print("decrease quantity: ");
                        products.get(id).printInfo(true);
                    }
                    else{
                        System.out.println("decrease quantity: error");
                    }
                }
            }
        //     for (int i = 0; i < products.size(); i++) {
        //     System.out.println(products.get(i));
        // }
        }
    }
}
