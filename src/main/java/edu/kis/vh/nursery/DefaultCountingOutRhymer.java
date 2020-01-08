package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int number12 = 12;
	public static final int number1 = -1;
	private int[] numbers = new int[number12];

	public int total = number1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == number1;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return number1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return number1;
		return numbers[total--];
	}

}
