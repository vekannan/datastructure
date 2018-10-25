package com.java.dts.arrays;

public class ArrayRottation {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};
		ArrayRottation arrayRotation = new ArrayRottation();
		arrayRotation.rotateArrayByCount(array, 3);
		arrayRotation.printAray(array);
	}
	
	private int[] rotateArrayByCount(int[] arrayInput,int count) {
		for(int i=0;i<count;i++) {
			arrayInput = this.rotateArray(arrayInput, arrayInput.length);
		}
		return arrayInput;
	}
	
	private int[] rotateArray(int[] rotatedArray, int length) {
		int start = rotatedArray[0];
		int count = 0;
		while(count < length-1) {
			rotatedArray[count] = rotatedArray[++count];
		}
		rotatedArray[count] = start;
		return rotatedArray;
	}
	
	
	private void printAray(int[] arrayToPrint) {
		for(int number : arrayToPrint)
			System.out.print(number);
	}

}
