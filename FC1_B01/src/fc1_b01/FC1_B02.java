package fc1_b01;

import java.util.Scanner;

public class FC1_B02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Scanner kb = new Scanner(System.in);
		b = kb.nextInt();
		//int c = a + b;
		Scanner sc1 = new Scanner(System.in);
		c = sc1.nextInt();
		double d = a/b;
		if(a >= b && a >= c) {
			System.out.print(a);
		}
		else if(b >= a && b >= c) {
			System.out.print(b);
		}
		else {
			System.out.print(c);
		}
//		System.out.print("Tong: " + (a+b));
//		System.out.print("\nHieu:" + (a-b) );
		System.out.println("\nThuong: " + d);
	}

}
