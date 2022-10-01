import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Employee {
	private String name;
	double hs;
	Employee(){
		this.name = " ";
		this.hs = 0;
	}
	Employee(String a, double b){
		this.name = a;
		this.hs = b;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.print("Nhap he so luong: ");
		this.hs = sc.nextDouble();
	}
	public void output() {
		System.out.println("Ten: " + this.name + " He so luong: " + this.hs );
	}
	public String toString() {
		return "Ten: " + this.name + "He so luong: " + this.hs;
		
	}
	public void salary() {
		double sal = 1500000 * this.hs;
		System.out.println("Luong: " + sal);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHs() {
		return hs;
	}
	public void setHs(double hs) {
		this.hs = hs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
