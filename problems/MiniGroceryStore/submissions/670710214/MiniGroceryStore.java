/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
public int count;
public final int id;
public String name;
private int minimum;
private int quantity;

Product(String name,int minimum,int quantity,int count){
    this.name =name;
    this.minimum =minimum;
    this.quantity =quantity;
    this.id =count;
}

public int getQuantity(){
    return this.quantity;
}

public boolean setQuantity(int quantity) {
    if (this.quantity-quantity>=this.minimum) {
        this.quantity = this.quantity-quantity;
        return true;
    }
    else{
        return false;
    }
}

public boolean isAvailable(){
    if (this.minimum<this.quantity) {
        return true;
    }
    else{
        return false;
    }
}

public void printInfo(boolean a){
    if (a) {
        System.out.print(this.id+" ");
        System.out.print(this.name+" ");
        System.out.print(this.minimum+" ");
        System.out.print(this.quantity+" ");
        System.out.println(this.isAvailable());
    }
    else{
        System.out.print(this.id+" ");
        System.out.println(this.name);
    }
    
}

}
public class MiniGroceryStore {
 
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
Product[] P =new Product[999];
int i=0;
 while (true) {
 int action = sc.nextInt();
 if (action == -1) {
    break;
 }

else if (action == 1) {
String name = sc.next();
int minimum = sc.nextInt();
int quantity = sc.nextInt();
if(minimum<0){
    minimum=0;
}
if(quantity<0){
quantity=0;
}
System.out.print("add new product: ");
i++;
P[i]=new Product(name, minimum, quantity,i);
P[i].printInfo(true);


}

 else if (action == 2) {
 int id = sc.nextInt();
 if(P[id]==null||id<=0||id>10){
    System.err.println("remove product: not found");
 }
 else{
    System.err.print("remove product: ");
    P[id].printInfo(false);
    P[id] =null;
 }
 }

 else if (action == 3) {
 int id = sc.nextInt();
 int n = sc.nextInt();
if (P[id]==null) {
    System.out.println("decrease quantity: not found");
}
else if (n<0) {
    System.out.println("decrease quantity: error n");
}
else{
    if (P[id].setQuantity(n)) {
        P[id].getQuantity();
        System.out.print("decrease quantity: ");
        P[id].printInfo(true);
    }
    else{
        System.out.println("decrease quantity: error");
    }
}
 }
 }
for(int id=0;id<11;id++){
    if (id>i) {
        break;
    }
    if (P[id]==null) {
        continue;
    }
    else{
        P[id].printInfo(true);
    }
    
    
}
 }
} 
