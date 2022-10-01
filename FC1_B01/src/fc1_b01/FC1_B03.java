package fc1_b01;

import java.util.Random;
// lop truu tuong
import java.util.Scanner;
abstract class bike{
	abstract void run();
	void chagre() {
		System.out.println("Hello world");
	}
}
class honda extends bike{
	void run() {
		System.out.println("Honda");
	}
}
/*lop ao thuan tuy
interface printable{
	void print();
}
interface showable{
	void show();
	}
}
class A implements printable, showable{
	void print(){
		dinh nghia o day
	}
	void show(){
		dinh nghia o day
	}
*/
public class FC1_B03 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int[] array = new int[100];
//		int[] c = {0,1,2,3,4,5,6,7,8,9};
//		Random rand = new Random();
//		for(int i = 0; i < array.length; i++ ) {
//			array[i] = rand.nextInt(10);
//		}
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]+" ");
//		}
//		for(int i = 0; i <array.length; i++) {
//			c[array[i]]++;
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + " " + c[i]);
//		}
		bike obj = new honda();
		obj.run();
		obj.chagre();
	}

}
