package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		return new int[positions];
	}

	public static String[] createInitializedStringArray() {
		String[] stringArray = new String[3];
		stringArray[0] = "1";
		stringArray[1] = "2";
		stringArray[2] = "3";
		return stringArray;
	}

	public static void populateArray(int[] array, int index, int value) {
		array[index] = value;
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		System.out.println(array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
		for (String s : stringArray) {
			System.out.println(s);
		}
	}
}
