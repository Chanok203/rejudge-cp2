/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;

class Product{
    
    public  int count = 0;
    public final int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        count+=2;
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count;
        if (minimum<0) {
            minimum=0;
            
        }
        if (quantity<0) {
            quantity=0;
        }
       
       
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int a) {
        if (a >= minimum) {
            quantity += a;
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

    public void printInfo(boolean b) {
        if (b) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            System.out.println(id + " " + name);
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
                
                
                Product pdd = new Product(name, minimum, quantity);
                pd.add(pdd);
                System.out.print("add new product: ");
                pdd.printInfo(true);
                

            }
           
            else if (action == 2) {
                int id = sc.nextInt();

               
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
        }
        int c= 0;
        for(int i=0;i<pd.size();i++){
        pd.get(c).printInfo(true);
        c++;
        }
    }
}
