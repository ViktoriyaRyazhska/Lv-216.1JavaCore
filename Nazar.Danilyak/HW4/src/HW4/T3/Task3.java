package HW4.T3;

public class Task3 {
	private int[] array;

	public Task3(int[] array) {

		this.array = array;
	}

	public int indexTwoInt() {
		int tempIndex = 1;
		for (int i = 0; i < array.length; i++) {
			if (tempIndex == 2) {
				return array[i];
			}
			if (array[i] >= 0) {
				tempIndex++;
			}

		}
		return -1;
	}

	public int min() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

	public int Index() {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (min() == array[i]) {
				System.out.println(i);
			}

		}
		return index;
	}
}