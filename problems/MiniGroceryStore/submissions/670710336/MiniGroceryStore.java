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
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int num) {
        if (num >= minimum) {
            this.quantity = num;
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

    public void printInfo(boolean ex) {
        if (ex) {
            System.out.println(String.format("%d %s %d %d %s", id, name, minimum, quantity, isAvailable()));
        } else {
            System.out.println(String.format("%d %s", id, name));
        }
    }
}

public class MiniGroceryStore {
    public static int Remove(ArrayList<Product> ex, int id) {
        for (int i = 0; i < ex.size(); i++) {
           
                Product a = ex.get(i);
                if (a.id == id) {
                    return i;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> P = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                int i = 0;
                P.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                P.get(P.size()-1).printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                int x = MiniGroceryStore.Remove(P, id);
                if (x >= 0) {
                    System.out.println("remove product: " + P.get(x).id+" "+P.get(x).name);
                    P.remove(x);
                } else if (x < 0) {
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

            }
        }
        for (int i = 0; i < P.size(); i++) {
            P.get(i).printInfo(true);
        }
    }
}