package fc1_b01;

import java.util.Random;
import java.util.Scanner;

public class FC1_B03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
		int[] array = new int[100];
		int[] c = {0,1,2,3,4,5,6,7,8,9};
		Random rand = new Random();
		for(int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(10);
		}
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]+" ");
//		}
		for(int i = 0; i <array.length; i++) {
			c[array[i]]++;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " " + c[i]);
		}
	}

}
