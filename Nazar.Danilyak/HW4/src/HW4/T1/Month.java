package HW4.T1;

public class Month {
	private int[] month = new int[12];

	public Month() {
		// {31,28,31,30,31,30,31,31,30,31,30,31}
		month[0] = 31;
		month[1] = 28;
		month[2] = 31;
		month[3] = 30;
		month[4] = 31;
		month[5] = 31;
		month[6] = 31;
		month[7] = 31;
		month[8] = 30;
		month[9] = 31;
		month[10] = 30;
		month[11] = 31;

	}

	public int[] getMonth() {
		return month;
	}

	public int sizeMonth(int index) {

		return month[index - 1];
	}

}