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

    public final int id = 0;
    public int count = 1;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {

        this.name = name;

        if (minimum < 0) {

            this.minimum = 0;
        } else {
            this.minimum = minimum;

        }
        if (quantity < 0) {
            this.quantity = 0;

        } else {

            this.quantity = quantity;
        }
    }

    public int getQuantity() {

        return quantity;
    }

    boolean cc;

    boolean setQuantity(int newminimum) {

        if (quantity <= newminimum) {

            this.count++;
            return cc = false;
        }

        this.count++;
        return cc = true;

    }

    public boolean isAvailable() {
        this.count++;
        return setQuantity(minimum);
    }

    void printInfo(boolean cc) {
        this.count++;
        System.out.println(name + " " + minimum + " " + quantity + " " + isAvailable());

    }

}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> pd = new ArrayList<>();
        int j = 0;
        while (true) {
            int action = sc.nextInt();

            if (action == -1) {

                break;

            }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();

                pd.add(new Product(name, minimum, quantity));
               // System.out.print("add new product: ");
           //    System.err.print(j + 1 + " ");
              //  pd.get(j).printInfo(false);

            }

            else if (action == 2) {
                int id = sc.nextInt();

            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

            }
            j++;
        }

        for (int i = 0; i < pd.size(); i++) {
         System.out.print("add new product: ");
         System.err.print(i+1+" ");
         pd.get(i).printInfo(false);}

        for (int i = 0; i < pd.size(); i++) {

            System.err.print(i + 1 + " ");
            pd.get(i).printInfo(false);

        }

    }
}
