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
		
		int maxSize = -1;
		
		System.out.println("Enter the number of products you would like to add.");
		System.out.println("Enter 0 (zero) if you do not wish to add products: ");
		
		do {
			try {
				maxSize = in.nextInt();
				if (maxSize < 0) {
					System.out.println("Incorrect Value entered.");
				}
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			in.nextLine();
		} while (maxSize < 0);
		
		if (maxSize == 0) {
			System.out.println("No products required!");
		} else {
			Object products[] = new Object[maxSize];
			for (int i = 0; i < maxSize; i++) {
				
				System.out.println("Product "+(i+1));
				
				System.out.println("Input your product name : ");
				tempName = in.nextLine();
				System.out.println("Input the quantity of your product : ");
				tempQty = in.nextInt();
				System.out.println("Input the price of your product : ");
				tempPrice = in.nextLong();
				System.out.println("Input a desired item number for your product : ");
				tempNumber = in.nextInt();
				
				Product obj = new Product(tempNumber, tempName, tempQty, tempPrice);
				products[i] = obj;
				
				in.nextLine();
			}
			
			in.close();
			
			for (int i = 0; i < (1- maxSize); i++) {
				System.out.println(products[i]);
			}
		}
		
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
