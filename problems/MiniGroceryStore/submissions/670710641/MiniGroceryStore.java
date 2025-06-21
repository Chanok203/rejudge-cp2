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
    public static int count;
    public final int id;
    public String name;
    public int minimum;
    public int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if (minimum<0) {
            this.minimum=0;
        }
        else{
            this.minimum=minimum;
        }
        if (quantity<0) {
            quantity=0;
        }
        else{
            this.quantity=quantity;
        }
        this.count++ ;
        this.id = count;
        
    }

    public int getQuantity() {
        return quantity;
    }

    boolean setQuantity(int N) {
        if (N >= minimum) {
            quantity = N;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (quantity - minimum > 0) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo(boolean valid) {
        if (valid) {
            System.out.println(id+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
        }
        else{
            System.out.println(id+" "+name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product>products = new ArrayList<>();
        int N=0;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
              break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product a = new Product(name, minimum, quantity);
                products.add(a);
                System.out.print("add new product: ");
                 N=a.count-1;
                products.get(a.count-1).printInfo(true);
                
            }
            else if (action == 2) {
                int id = sc.nextInt()-1;
                if (id<N && id>=0) {
                    products.get(id).printInfo(false);
                    products.remove(id);
                    N=products.get(id).count;
              }
              else{
                System.out.println("remove product: not found");
              }
              
            }
           
            else if (action == 3) {
                int id = sc.nextInt()-1;
                int n = sc.nextInt();
                if (id>N || id<0) {
                    System.out.println("decrease quantity: not found");
                }
                 if (n<=0) {
                    System.out.println("decrease quantity: error n");
                }
                if (n>0 && id<N && id>=0) {
                    products.get(id).getQuantity();
                    products.get(id).setQuantity(n);
                    boolean valid = products.get(id).setQuantity(n);
                    if (valid) {
                        System.out.println("decrease setQuantity");
                        products.get(id).printInfo(valid);
                    }
                    else{
                        System.out.println("decrease quantity: error");
                        products.get(id).printInfo(valid);
                        
                    }
                    
                }
            }
        }
        for(Product i : products){
            i.printInfo(true);
        }
    }
}
