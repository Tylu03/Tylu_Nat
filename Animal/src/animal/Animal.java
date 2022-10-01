package animal;

import java.util.Scanner;

public class Animal {
	private String sex, food;
	private double weight;
	Animal(){
		
	}
	Animal(String a, String b, double c){
		this.sex = a;
		this.food = b;
		this.weight = c;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return "Sex: " + this.sex + " Food: " + this.food + " Weight: "+ this.weight;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sex(Female/Male): ");
		this.sex = sc.nextLine();
		System.out.print("Enter Food: ");
		this.food = sc.nextLine();
		System.out.print("Enter Weight: ");
		this.weight = sc.nextDouble();
	}
	public void output() {
		System.out.println("Sex: " + this.sex + " Food: " + this.food + " Weight: "+ this.weight);
	}
	public static void main(String[] args) {
		

	}

}
