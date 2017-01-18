package shop.logic;

public class RunConsoleShop {

	public static void main(String[] args) {

		try {
			new ConsolMenuLogic().doAction();
		} catch (Exception e) {
			System.err.println("PROGRAM CRASHED !");
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
