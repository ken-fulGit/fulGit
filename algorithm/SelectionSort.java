package algorithm;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = {10,4,9,23,6,1};
		
		
		for(int i = 0; i < array.length;i++) {
			int min = i;
			for(int j = i+1;j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
		}
		Arrays.stream(array).forEach(s->System.out.print(s + "\t"));
	}
}
