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
    public final String name;
    private int minimum;
    private int quantity;

    public Product (String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;

        this.id = 0;
    }

    public int getQuantity(){
        return quantity;

    }

    public boolean setQuantity(){
            return true;

    }
    public int isAvailable(){
        return count;

    }
    public void printInfo(){
        boolean ad;
    }
    
}
public class MiniGroceryStore {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList ar = new ArrayList<>();
    int id = sc.nextInt();
    String name = sc.next();
    int minimum = sc.nextInt();
    int quantity = sc.nextInt();


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
    
 }
 // remove
 else if (action == 2) {
 int id = sc.nextInt(); 

}
// decrease quantity
else if (action == 3) {
int id = sc.nextInt();
int n = sc.nextInt();

}
}
}
}

