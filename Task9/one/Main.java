package ua.bilas;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(squareRectangle(-2, 4));;
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
			e.printStackTrace();
		}
		System.out.println("hell");
	}
	
	public static int squareRectangle(int a, int b) throws MyException {
		if(a < 0 || b < 0){
			throw new MyException("You added negative number");
		}
		return a * b;
	}
}
