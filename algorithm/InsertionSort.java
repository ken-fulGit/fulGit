package algorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = {10,4,9,23,6,12,1};
		
		
		for(int i = 1; i < array.length;i++) {
			for(int j = i;0 < j && array[j] < array[j-1]  ; j--) {
				int tmp = array[j];
				array[j] = array[j-1];
				array[j-1] = tmp;
			}

		}
		Arrays.stream(array).forEach(s->System.out.print(s + "\t"));
	}
}
