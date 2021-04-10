package inventoryProject;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		System.out.println(keyboard+"\n");
		System.out.println(mouse+"\n");
		System.out.println(monitor+"\n");
		System.out.println(table+"\n");
		System.out.println(chair+"\n");
		System.out.println(pen+"\n");
		
	}

}
