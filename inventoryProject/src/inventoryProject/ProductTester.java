package inventoryProject;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int tempNumber;
		String tempName;
		int tempQty;
		long tempPrice;
		
		System.out.println("Input your product name : ");
		tempName = in.nextLine();
		System.out.println("Input the quantity of your product : ");
		tempQty = in.nextInt();
		System.out.println("Input the price of your product : ");
		tempPrice = in.nextLong();
		System.out.println("Input a desired item number for your product : ");
		tempNumber = in.nextInt();
		
		Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
		
		// clear the input value
		in.nextLine();
		
		System.out.println("Input your product name : ");
		tempName = in.nextLine();
		System.out.println("Input the quantity of your product : ");
		tempQty = in.nextInt();
		System.out.println("Input the price of your product : ");
		tempPrice = in.nextLong();
		System.out.println("Input a desired item number for your product : ");
		tempNumber = in.nextInt();
		
		Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
		
		in.close();
		
		Product keyboard = new Product();
		keyboard.setNoItem(1);
		keyboard.setItem("Keyboard");
		keyboard.setQty(2);
		keyboard.setPrice(400000);
		
		Product mouse = new Product();
		mouse.setNoItem(2);
		mouse.setItem("Mouse");
		mouse.setQty(2);
		mouse.setPrice(280000);
		
		Product monitor = new Product(3, "Monitor", 2, 1000000);
		Product table = new Product(4, "Table", 3, 250000);
		Product chair = new Product(5, "Chair", 3, 420000);
		Product pen = new Product(6, "Writing Pen", 6, 20000);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(keyboard);
		System.out.println(mouse);
		System.out.println(monitor);
		System.out.println(table);
		System.out.println(chair);
		System.out.println(pen);
		
		Product p6 = new Product(7, "Tires", 9, 479000);
		p6.setActive(false);
		
		System.out.println(p6);
		
		
	}

}
