/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
// TODO: write your code here (ถาตองการใช lib อื่นสามารถ import เพิ่มได เชน ArrayList หรือMath เปนตน)
class Product {
 // TODO: write your code here
 public static int count=0;
public final int id;
public  String name;
private int minimum;
private int quantity;
Product(  String name,  int minimum,  int quantity){
    this.name=name;
    this.minimum=minimum;
    this.quantity=quantity;
    this.id = ++count;

    if (this.minimum <0) {
        this.minimum=0;
    }
    if (this.quantity<0) {
        this.quantity=0;
    }
}
public int getQuantity(){
    return this.quantity;
}
public boolean setQuantity(int newQ){
    if (newQ >= this.minimum) {
        this.quantity = newQ;
        return true;
    }
    return false;
}
public boolean isAvailable(){
    if (this.quantity-this.minimum > 0) {
        return true;
    }
    return false;
}
void printInfo(){
    System.out.println(this.id+" "+this.name+" "+this.minimum+" "+this.quantity+isAvailable());
}
}
public class MiniGroceryStore {
 // TODO: write your code here (ถาตองการเขียน method
 // เพื่อชวยใหทำงานงายขึ้นสามารถเขียนเพิ่มเติมได เชน การตามหา object ดวย id
 // เปนตน)
    
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // TODO: write your code here (แนะนำใหสราง array หรือ ArrayList ตรงนี้)
 Product[] p1 = new Product[10];
 while (true) {
 int action = sc.nextInt();
 // stop
 if (action == -1) {
 // TODO: write your code here
 //System.out.println(p1[action].id+" "+p1[action].name);
 break;
 }
 // add
 else if (action == 1) {
 String name = sc.next();
 int minimum = sc.nextInt();
 int quantity = sc.nextInt();
 // TODO: write your code here
 p1[action] = new Product(name, minimum, quantity);
 System.out.print("add new product: ");
 p1[action].printInfo();
 
 }
 // remove
 else if (action == 2) {
 int id = sc.nextInt();
 // TODO: write your code here
 if (id == id) {
    p1[id].name = "null";
    System.out.println("remove product: ");
    
 }else{
    System.out.println("remove product: not found   ");
 }
}
// decrease quantity
else if (action == 3) {
int id = sc.nextInt();
int n = sc.nextInt();
// TODO: write your code here
if (id!=id) {
    System.out.println("decrease quantity: not found");
}else if (n<=0) {
    System.out.println("decrease quantity: error n");
}else{
    p1[action].getQuantity();
    p1[action].setQuantity(n);
    System.out.println("decrease quantity");
    p1[action].printInfo();
    if (!p1[action].setQuantity(n)) {
        System.out.println("decrease quantity: error");
    }
}
}


}
// TODO: write your code here
    Product p2 = new Product(null, 0, 0);
    for (int i = 0; i < 3; i++) {
        p2.printInfo();
    }
}
} 