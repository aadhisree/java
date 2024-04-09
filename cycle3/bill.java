import java.util.Scanner;
interface Bill {
void calculate();
}
class Order implements Bill {
private int orderNo;
private String date;
private int[] productId;
private String[] name;
private int[] quantity;
private double[] unitPrice;
public Order(int orderNo, String date, int[] productId, String[] name, int[] quantity,
double[] unitPrice) {
this.orderNo = orderNo;
this.date = date;
this.productId = productId;
this.name = name;
this.quantity = quantity;
this.unitPrice = unitPrice;
}
public void calculate() {
double netAmount = 0.0;
System.out.println();
System.out.println("Order No.: " + orderNo + "\tDate: " + date);
System.out.println();
System.out.println("Product Id\tName\t\tQuantity\tUnit Price\tTotal");
System.out.println("---------------------------------------------------");
for (int i = 0; i < productId.length; i++) {
double total = quantity[i] * unitPrice[i];
netAmount += total;
System.out.printf("%d\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n",
productId[i], name[i], quantity[i], unitPrice[i], total);

}
System.out.println("---------------------------------------------------");
System.out.printf("\t\t\t\t\tNet. Amount\t%.2f\n", netAmount); }
}
public class bill {
public static void main(String[] args) {
System.out.println("Name: Aditya Suresh\nRollno: 23mca004\nTitle: Bill Calculator (Interface)\nDate: 08-04-2024\n");
System.out.println();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the order number: ");
int orderNo = scanner.nextInt();
System.out.print("Enter the date: ");
String date = scanner.next();
System.out.print("Enter the number of products: ");
int numProducts = scanner.nextInt();
int[] productId = new int[numProducts];
String[] name = new String[numProducts];
int[] quantity = new int[numProducts];
double[] unitPrice = new double[numProducts];
for (int i = 0; i < numProducts; i++) {
System.out.println("Enter details for Product " + (i + 1));
System.out.print("Product ID: ");
productId[i] = scanner.nextInt();
scanner.nextLine(); 
System.out.print("Name: ");
name[i] = scanner.nextLine();
System.out.print("Quantity: ");
quantity[i] = scanner.nextInt();
System.out.print("Unit Price: ");
unitPrice[i] = scanner.nextDouble();
}
Order order = new Order(orderNo, date, productId, name, quantity, unitPrice);
order.calculate();
scanner.close();
}
}
