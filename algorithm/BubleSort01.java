package algorithm;

import java.util.Arrays;

public class BubleSort01 {
	public static void main(String[] args) {
		int[] array = {10,4,23,6,1};
		for(int i = array.length-1; 1 <= i;i--) {
			for(int j = i-1;0 <= j; j--) {
				if(array[i] < array[j]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		Arrays.stream(array).forEach(s->System.out.print(s + "\t"));
	}
}
