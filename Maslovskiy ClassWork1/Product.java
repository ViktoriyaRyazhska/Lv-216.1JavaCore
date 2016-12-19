import java.util.Scanner;

public class Product {

		
		private String name;
		private double price;
		private int quantity;
		Scanner scn = new Scanner(System.in);
		public Product() {
			input(scn);
		}
		private void input(Scanner scn) {
			System.out.println("Input name");
			name = scn.nextLine();
			System.out.println("Input price");
			price = Double.valueOf(scn.nextLine());
			System.out.println("Input quantity");
			quantity = Integer.parseInt(scn.nextLine()); 
			
		}
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", quantity="
					+ quantity + "]";
		}
		
		
}
