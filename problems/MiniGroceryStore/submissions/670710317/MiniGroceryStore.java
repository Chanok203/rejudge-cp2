/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    static public int count = 1;
    final int id= count;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;
    }

    public int getQuantity() {
        return quantity;
    }

    int setQuantity(int N) {
        if (N > minimum) {
            N = quantity;
        }
        return N;
    }

    public boolean isAvailable() {
        boolean isAvailable;
        if (minimum <= quantity) {
            isAvailable = true;
        } else {
            isAvailable = false;
        }
        return isAvailable;
    }

    public void printInfo(boolean isAvailable) {
        
            System.out.println(count + " " + name + " " + minimum + " " + quantity + " " + isAvailable);
        
            System.out.println(count + " " + name);
       
    }

}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            Product[] p = new Product[100];
            int count =1;
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
                boolean isAvailable;
                if(minimum<=quantity){
            isAvailable = true;
        }
        else{
            isAvailable=false;
        }
                System.out.println("add new product:"+count+" "+name+" "+minimum+" "+quantity+" "+isAvailable );
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                p[0].setQuantity(id);
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                p[0].setQuantity(n);
            }
            count++;
        }
        
    }
}
