package algorithm;

import java.util.Arrays;

public class BubleSort02 {
	public static void main(String[] args) {
		int[] array = {10,4,23,6,1};
		for(int i = 0; i < array.length;i++) {
			for(int j = i+1;j < array.length; j++) {
				if(array[j] < array[i]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		Arrays.stream(array).forEach(s->System.out.print(s + "\t"));
	}
}
