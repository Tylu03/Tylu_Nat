package fc1_b01;

import java.util.Scanner;

class people{
	String name, que;
	int age;
	people(){
		
	}
	people(String a, String b, int c){
		name = a;
		que = b;
		age = c;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap que: ");
		this.que = sc.nextLine();
	}
	void output() {
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Que: " + que);
	}
}
public class employee extends people {
	double hs;
	employee(){
		
	}
	employee(String a, String b, int c, double d){
		super(a,b,c);
		hs = d;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Nhap hs luong: ");
		this.hs = sc.nextDouble();
		}
	void output() {
		super.output();
		System.out.println("He so luong: " + hs);
	}
	public static void main(String[] args) {
		employee emp = new employee();
		emp.input();
		emp.output();

	}

}
