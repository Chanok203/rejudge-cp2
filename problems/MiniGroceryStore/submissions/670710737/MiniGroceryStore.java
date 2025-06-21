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

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;

        id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n) {
        boolean checkmini = n >= minimum;
        if (checkmini) {
            this.quantity -= n;
            return true;
        } else {
            return false;
        }

    }

    public boolean isAvailable(boolean setQuantity) {
        if (setQuantity && quantity > minimum) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo (boolean chk) {
        if (chk) {
            System.out.println(id + " " + name +" " + minimum +" " + quantity +" " + isAvailable(chk));
        } else {
            System.out.println(id +" " + name);
        }
    }

}

public class MiniGroceryStore {

    static boolean find(ArrayList<Product> products, int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        MiniGroceryStore mn = new MiniGroceryStore();
        boolean chk = false;
        Product pd;
        while (true) {
            int action = sc.nextInt();

            if (action == -1) {
                for (int i = 0; i < products.size(); i++) {
                    products.get(i).printInfo(true);
                }
                return;

            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pd = new Product(name, minimum, quantity);
                products.add(pd);
                System.out.print("add new product: ");
                pd.printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (mn.find(products, id)) {
                    products.remove(products.get(n));
                }
            }
            // decrease quantity
            /*else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (mn.find(products, id) && n > 0) {
                    pd.getQuantity();
                    pd.setQuantity(n);
                }

            }
            if (chk) {
                pd.printInfo(chk);
            }*/
        }
        
    }
}

