package ua.com.maslovskiy;

public class newCity {
	private String[] s;


	public newCity(String[] strings) {
		super();
		this.s = strings;
	}

	public String[] getS() {
		return s;
	}

	public void setS(String[] s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "newCity [s=" + s + "]";
	}
}
