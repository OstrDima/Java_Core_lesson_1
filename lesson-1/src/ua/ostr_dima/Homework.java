package ua.ostr_dima;

public class Homework {
	public static void main(String[] args) {
		boolean f = true;
		char x = '$';
		byte a = 1;
		short p = 3;
		int d = 100;
		long w = 22L;
		float k = 22.5f;
		double c = 145.6;
		System.out.println("Змінні:" + f + " " + x + " " + a + " " + p + " " + d + " " + w + " " + k + " " + c);

		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Character =" + Character.MIN_VALUE);
		System.out.println("Character =" + Character.MAX_VALUE);
		System.out.println("Double =" + Double.MIN_VALUE);
		System.out.println("Double =" + Double.MAX_VALUE);
		System.out.println("Float =" + Float.MIN_VALUE);
		System.out.println("Float =" + Float.MAX_VALUE);
		System.out.println("Integer =" + Integer.MIN_VALUE);
		System.out.println("Integer =" + Integer.MAX_VALUE);
		System.out.println("Long =" + Long.MIN_VALUE);
		System.out.println("Long =" + Long.MAX_VALUE);
		System.out.println("Short =" + Short.MIN_VALUE);
		System.out.println("Short =" + Short.MAX_VALUE);
		Boolean max = true;
		Boolean min = false;
		System.out.println("MaxBoolean =" + max);
		System.out.println("MinBoolean =" + min);

		int[] array = { 9, 10, 3, 44, 5, 20, 11, 12, 8, 2 };
		int maxValue = array[0];

		for (int i : array) {
			if (i > maxValue)
				maxValue = i;
		}

		System.out.println("MaxValue = " + maxValue);
		int minValue = array[0];

		for (int i : array) {
			if (i < minValue)
				minValue = i;
		}

		System.out.println("MinValue = " + minValue);

	}
}

