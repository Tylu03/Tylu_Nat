package animal;

import java.util.Scanner;

public class Dog extends Animal {
	private String name, species;
	private int age;
	Dog(){
		
	}
	Dog(String a, String b, double c, String d, String e, int f){
		super(a,b,c);
		this.name = d;
		this.species = e;
		this.age = f;
	}
	public String toString() {
		if(super.getSex().equals("F")) {
			System.out.println("Toi la Co Cho!");
		}else {
			System.out.println("Toi la Chu Cho");
		}
		return "Name: " + this.name + " Species: " + this.species + " Age: " + this.age + super.toString();
	}
	public void inputD() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter Species: ");
		this.species = sc.nextLine();
		System.out.print("Enter Age: ");
		this.age = sc.nextInt();
		super.input();
	}
	public void outputD() {
		if(super.getSex().equals("F")) {
			System.out.println("Toi la Co Cho!");
		}else {
			System.out.println("Toi la Chu Cho");
		}
		System.out.print("Name: " + this.name + " Species: " + this.species + " Age: " + this.age);
		super.output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
