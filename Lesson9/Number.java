package lesson9;

public class Number {
	/*
	 * Write a method readNumber(int start, int end), that read from console
	 * integer number and return it, if it is in the range [start...end]. If an
	 * invalid number or non-number text is read, the method should throw an
	 * exception. Using this method write a method main(), that has to enter 10
	 * numbers: a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
	 */

	public class RangeException extends Exception {
		public RangeException(String message) {
			super(message);
		}
	}

	public int readNumber(int start, int end, int current) throws RangeException {
		if (current < start || current > end) {
			throw new RangeException("Current integer " + current + " is out of Range [" + start + ", " + end + "]");
		}
		return current;
	}

}
