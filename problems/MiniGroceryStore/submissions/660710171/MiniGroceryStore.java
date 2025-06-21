/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    public static int count = 0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(final String name,int minimum,int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;

        this.id = count;
        if(minimum < 0){
            minimum = 0;
        } else if (quantity < 0){
            quantity = 0;
        }
    }

    public boolean getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int x) {
        if (x > minimum) {
            x += quantity;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable(){
        if (minimum > quantity){
            return false;
        } else {
            return true;
        }
    }

    public void printInfo(boolean x){
        if (x == true){
            System.out.println(id + name + minimum + quantity + isAvailable());
        } else {
            System.out.println(id + name);
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product(null, 0, 0);
        int count = 1;
        String[] arr1 = new String[count];
        int [] arr2 = new int[count];
        int [] arr3 = new int[count];
        int [] idarr = new int[count];
        while (true) {
            //count ++;
            int action = sc.nextInt();
            if (action == -1) {
                break;
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                name += arr1[count];
                minimum += arr2[count];
                quantity += arr3[count];
                idarr[count] ++;
                System.out.println("add new product:");
            } else if (action == 2) {
                int id = sc.nextInt();
                if(id == idarr[id]){
                    System.out.println("remove product:");
                } else {
                    System.out.println("remove product: not found");
                }
            } else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
            }
        }
    }
}