package animal;

import java.util.Scanner;

public class Cat extends Animal {
	private String name;
	private int age;
	Cat(){
		
	}
	Cat(String a, String b, double c, String d, int f){
		super(a,b,c);
		this.name = d;
		this.age = f;
	}public String toString() {
		if(super.getSex().equals("F")) {
			System.out.println("Toi la Co Meo!");
		}else {
			System.out.println("Toi la Chu Meo");
		}
		return "Name: " + this.name + " Age: " + this.age + super.toString();
	}
	public void inputC() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter Age: ");
		this.age = sc.nextInt();
		super.input();
	}
	public void outputC() {
		if(super.getSex().equals("F")) {
			System.out.println("Toi la Co Meo!");
		}else {
			System.out.println("Toi la Chu Meo");
		}
		System.out.print("Name: " + this.name + " Age: " + this.age);
		super.output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
