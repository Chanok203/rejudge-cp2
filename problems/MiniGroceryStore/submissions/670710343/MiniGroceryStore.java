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
    static int count = 0;
    int id;
    String name;
    private int minimum;
    private int quantity;
    boolean check = true;

    public Product(String name, int minimum, int quantity) {
        this.id = count;
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.check = isAvailable();
    }

    int getQuantity() {
        return quantity;
    }

    boolean setQuantity(int n) {
        if (n > minimum) {
            return false;
        } else {
            if(quantity - n <= 0){
                quantity = 0;
            }else{
                quantity -= n;
            }
            return true;
        }

    }

    boolean isAvailable() {
        return true;
    }

    void printInfo(boolean c) {
        if (c == true) {
            System.out.println(id+1 + " " + name);
        } else {
            if (minimum < quantity) {
                System.out.println(id+1 + " " + name + " " + minimum + " " + quantity + " " + "true");
            } else {
                System.out.println(id+1 + " " + name + " " + minimum + " " + quantity + " " + "false");
            }
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> a = new ArrayList<>();
        Product p = new Product(null, 0, 0);
        boolean c = false;
        while (true) {
            int action = sc.nextInt();

            if (action == -1) {
                break;
            }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                if (minimum < 1) {
                    minimum = 0;
                }
                if (quantity < 1) {
                    quantity = 0;
                }
                c = false;
                a.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                a.get(p.count).printInfo(c);
                p.count++;
            }

            else if (action == 2) {
                int id = sc.nextInt() - 1;
                if (id > a.size() || a.size() == 0 || id < 0) {
                    System.out.println("remove product: not found");
                } else {
                    c = true;
                    System.out.print("remove product: ");
                    a.get(id).printInfo(c);
                    a.set(id, p);
                }
            }

            else if (action == 3) {
                int id = sc.nextInt()-1;
                int n = sc.nextInt();

                if (id > a.size() || a.size() == 0 || id < 0) {
                    System.out.println("decrease quantity: not found");
                } else {
                    if(n<0){
                        c =false;
                    }else{
                        c = a.get(id).setQuantity(n);
                    }
                    if (c == true) {
                        System.out.print("decrease quantity: ");
                        a.get(id).printInfo(false);
                    } else {
                        if(n < 0){
                            System.out.println("decrease quantity: error n");
                        }else{
                            System.out.println("decrease quantity: error");
                        }
                    }
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).name != null){
                a.get(i).printInfo(false);
            }
        }
    }
}
