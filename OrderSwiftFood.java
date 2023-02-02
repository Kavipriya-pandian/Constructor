package dxc;

import java.util.Scanner;

public class OrderSwiftFood 
{
	int orderId=0;
	String status="",orderedFoods="";
	static double totalPrice=0;
	int nooffoods;
	double price;
	void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Order ID");
		orderId=sc.nextInt();
		System.out.println("Ordered Foods");
		orderedFoods=sc.next();
		System.out.println("Number of food");
		nooffoods=sc.nextInt();
		System.out.println("Status of the order");
		status=sc.next();
		System.out.println("Price of the food");
		price=sc.nextDouble();
		
	}
	
	double calculateTotalPrice()
	{
		
		
		totalPrice=(nooffoods*price)+0.05;
		
		return totalPrice;
		
		
	}
	void display()
	{
		System.out.println("The total price of the food is Rs."+totalPrice);
	}
	public static void main(String[] args) {
		
		OrderSwiftFood f=new OrderSwiftFood();
		f.getdetails();
		f.calculateTotalPrice();
		f.display();
	}

}
 