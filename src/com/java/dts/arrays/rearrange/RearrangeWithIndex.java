package com.java.dts.arrays.rearrange;

public class RearrangeWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,-1,3,4,2,6,5,-1};
		for(int i = 0; i <= array.length-1; i++) {
			if(array[i] != -1 && array[i] != i) {
				int x = array[i];
				while(array[x] != -1 && array[x] != x) {
					int y = array[x];
					array[x] = x;
					x = y;
				}
				
				array[x] = x;
				if(array[i] != i) {
					array[i] = -1;
				}
			}
		}
		for(int count : array) {
			System.out.print(count);
		}
		
	}

}
