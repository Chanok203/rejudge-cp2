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
    public static int count = 1;
    public final int id = count;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.count++;
        this.name = name;
        if (minimum <= 0) {
            this.minimum = 0;
        } else {
            this.minimum = minimum;
        }
        if (quantity <= 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int n) {
        if (n >= minimum) {
            if( this.quantity - n <=0){
                this.quantity=0;
                return false;
            }else{
                this.quantity-=n;
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (minimum < quantity) {
            return true;
        } else {
            return false;
        }

    }

    public void printInfo(boolean isprivate) {
        if (isprivate) {
            System.out.print(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            System.out.print(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        boolean isprivate = true;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product a = new Product(name, minimum, quantity);
                products.add(a);

                System.out.print("add new product: ");
                isprivate = true;
                a.printInfo(isprivate);
            } else if (action == 2) {
                int id = sc.nextInt() - 1;
                if (id >= 0 && id < products.size()) {
                    isprivate = false;
                    System.out.print("remove product: ");;
                    products.get(id).printInfo(isprivate);
                    products.remove(id);
                } else {
                    System.out.println("remove product: not found");
                }
            } else if (action == 3) {
                int id = sc.nextInt() -1;
                int n = sc.nextInt();
                    if (id >= 0 && id < products.size()) {
                                    if (n <= 0) {
                                        System.out.println("decrease quantity: error n");
                                    } else {
                                        products.get(id).getQuantity();
                                        if (products.get(id).setQuantity(n)) {
                                            isprivate = true;
                                            System.out.print("decrease quantity: ");
                                            products.get(id).printInfo(isprivate);
                                        } else {
                                            System.out.println("decrease quantity: error");
                                        }
                                    }
                                
                            
                        
                    }
                    else {
                        System.out.println("decrease quantity: not found");
                    }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo(isprivate);
            System.out.println();
        }
    }
}
