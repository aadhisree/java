public class product
{
	int pcode;
	String pname;
	double price;
	double lowest;
	void data(int c,String n,double p){
		pcode=c;
		pname=n;
		price=p;
	}
	void display(){
		System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	}
	static void lowest(double price1,double price2,double price3){
			if(price1<=price2 && price1<=price3){
				System.out.println("\n product1 has lowest price");
			}
			else if(price2<=price1 && price2<=price3){
				System.out.println("\n product2 has lowest price");
			}
			else{
			System.out.println("\n product3 has lowest price");	
			}
			}
			public static void main(String[] args){
				System.out.println("\tAditya Suresh\n\t23mca004\n\t13/02/2024");
				product obj1= new product();
				product obj2= new product();
				product obj3= new product();
				obj1.data(101,"pro1",100.0);
				obj2.data(102,"pro2",128.0);
				obj3.data(103,"pro3",790.0);
				System.out.println("\nproduct information:\n pcode\t\tpname\t\tprice");
				obj1.display();
				obj2.display();
				obj3.display();
				lowest(obj1.price,obj2.price,obj3.price);
			}
		}
				
				
				
