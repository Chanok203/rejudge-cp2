/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;


class Product {
public int count = 0;
public int id;
public String name;
private int minimum;
private int quantity;

Product(String name, int minimum, int quantity){
this.name = name;
this.minimum = minimum;
this.id = count;
}

public void getQuantity(){

}
public void setQuantity(int Newquantity){
}
public void isAvailable(){

}
public void printlnfo(boolean b){

}


public class MiniGroceryStore {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while (true) {
int action = sc.nextInt();

if (action == -1) {

}

else if (action == 1) {
String name = sc.next();
int minimum = sc.nextInt();
int quantity = sc.nextInt();

}

else if (action == 2) {
int id = sc.nextInt();

}

else if (action == 3) {
int id = sc.nextInt();
int n = sc.nextInt();

}
}


}
}
}