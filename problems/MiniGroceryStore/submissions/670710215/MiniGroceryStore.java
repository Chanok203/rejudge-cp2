/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
 
class Product { 
    public static int count;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String na,int minimum,int quantity){
        this.name=na;
        this.minimum=minimum;
        this.quantity=quantity;
        this.count=0;

    }
} 
 
public class MiniGroceryStore { 
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        // TODO: write your code here (แนะนำใหสราง array หรือ ArrayList ตรงนี้) 
        while (true) { 
            int action = sc.nextInt(); 
            // stop 
            if (action == -1) { 
                // TODO: write your code here 
            } 
            // add 
            else if (action == 1) { 
                String name = sc.next(); 
                int minimum = sc.nextInt(); 
                int quantity = sc.nextInt(); 
                // TODO: write your code here 
            } 
            // remove 
            else if (action == 2) { 
                int id = sc.nextInt(); 
                  // TODO: write your code here 
            } 
            // decrease quantity 
            else if (action == 3) { 
                int id = sc.nextInt(); 
                int n = sc.nextInt(); 
                // TODO: write your code here 
            } 
        } 
        // TODO: write your code here 
    } 
} 