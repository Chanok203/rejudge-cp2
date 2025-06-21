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
public static int count =0;
public final int id;
public  final String name;
private int minimum;
private int quantity;
Product(String name, int minimum,int quantity){
this.name =name;
this.minimum= minimum;
this.quantity=quantity;
this.id = this.count++;
if(this.minimum<0){
    this.minimum=0;
}
if(this.quantity<0){
    this.quantity=0;
}
//this.count++;
}

public int getQuantity(){
    return quantity;
}
public int setQuantity(int set){
    if(set<this.minimum){
    return -1;
}else{
    this.quantity=set;
    return 1;
}
}
public boolean isAvailable(){
if(this.minimum<this.quantity){
    return true;
}else{
    return false;
}
}

public void printlnof(boolean priv){
if(priv==true){
    System.out.println((this.id+1)+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
}else{
    System.out.println((this.id+1)+" "+this.name);
}
}
}
public class MiniGroceryStore {
    /*static void newprod(){
    }*/

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
ArrayList<Product> products= new ArrayList<>();
 while (true) {
 int action = sc.nextInt();
//stop
 if (action == -1) {
break;
}
 // add
 else if (action == 1) {
 String name = sc.next();
 int minimum = sc.nextInt();
 int quantity = sc.nextInt();

Product p = new Product(name, minimum, quantity) ;
products.add(p);
System.out.print("add new product: ");
p.printlnof(true);

}
 // remove
 else if (action == 2) {
 int id = sc.nextInt();
if(products.equals(id)){
    products.remove(id);
    System.out.print("remove product: ");
    products.get(id).printlnof(false);
    return;
}else{
    System.out.println("remove product: not found");
}
}
 // decrease quantity
 else if (action == 3) {
 int id = sc.nextInt();
 int n = sc.nextInt();
 if(n<=0){
    System.out.println("decrease quantity: error n");
 }
if(products.equals(id)){

}else{
    
}
}
 }
for(int i =0;i<products.size();i++){
products.get(i).printlnof(true);
}
}
}
