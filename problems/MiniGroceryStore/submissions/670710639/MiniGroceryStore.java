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
    static public int count = 0;
    final public int id ;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name , int minimum , int quantity) {
        this.name = name;
        if (minimum < 0) {
            this.minimum = 0;
        }
        else {
            this.minimum = minimum;
        }
        if (quantity < 0) {
            this.quantity = 0;
        }
        else {
            this.quantity = quantity;
        }
        count ++;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int newQ)  {
        if (newQ < minimum) {
            return false;
        }
        quantity = newQ;
        return true;
    }

    public boolean isAvailable() {
        if (quantity - minimum <= 0) {
            return false;
        }
        return true;
    }

    public void printInfo(boolean isPrivate) {
        if (isPrivate) {
            System.out.println(id + " " + name + " " + minimum +" " + quantity + " " + isAvailable());
        }
        else {
            System.out.print(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    static int findId(ArrayList<Product> p , int id) {
        for (int i = 0; i < p.size(); i++) {
            Product pID = p.get(i);
            if (pID.id == id) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>(10);
        int number = 0;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                p.add(new Product(name, minimum, quantity));
                System.out.println("add new product: ");
                p.get(number).printInfo(true);
                number ++;
            }
            else if (action == 2) {
                int id = sc.nextInt() - 1;
                int index = findId(p, id);
                if (index != -1) {
                    p.remove(index);
                    System.out.println("“remove product: ");
                    p.get(index).printInfo(false);
                    number -= Product.count - number;
                }
                else {
                    System.out.println("remove product: not found");
                }

            }
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int index = findId(p, id);
                if (index == -1) {
                    System.out.println("decrease quantity: not found");
                }
                else if(n <= 0) {
                    System.out.println("decrease quantity: error n");
                }
                else {
                    if (!p.get(index).setQuantity(n)) {
                        System.out.println("decrease quantity: error");
                    }
                    else {
                        System.out.println("decrease quantity: ");
                        p.get(index).printInfo(true);
                    }
                }
            }
        }
        for (int i = 0; i < p.size(); i++) {
            p.get(i).printInfo(true);
        }
    }
}
