package ontap;

import java.util.ArrayList;
import java.util.Scanner;

interface hinh{
	double area();
	double perimeter();
}
abstract class shape implements hinh{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public shape() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name = sc.nextLine();
	}
	public shape(String name) {
		super();
		this.name = name;
	}
	public abstract void input();
	public abstract void output();
}
class circle extends shape{
	double radius;
	public circle() {
		
	}
	public circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "name: "+ super.getName() +" [radius=" + radius + ", getRadius()=" + getRadius() + ", area()=" + area() + ", perimeter()="
				+ perimeter() + "]";
	}

	@Override
	public double area() {
		double s = this.radius * this.radius * 3.14;
		return s;
	}

	@Override
	public double perimeter() {
		double p = 2 * this.radius * 3.14;		
		return p;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		this.radius = sc.nextDouble();
	}

	@Override
	public void output() {
		System.out.print("Radius: " + this.radius + " Area: " + this.area() + " Perimeter: " + this.perimeter());
	}
	
}
class rectangle extends shape{
	double lenght, wide;
	public rectangle() {
		
	}
	public rectangle(String name, double lenght, double wide) {
		super(name);
		this.lenght = lenght;
		this.wide = wide;
	}
	public double getLeght() {
		return lenght;
	}
	public void setLeght(double lenght) {
		this.lenght = lenght;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	@Override
	public double area() {
		double s = this.lenght * this.wide;
		return s;
	}

	@Override
	public double perimeter() {
		double p = 2 * (this.lenght + this.wide);
		return p;
	}
	
	@Override
	public String toString() {
		return "name: "+ super.getName() +" [lenght=" + lenght + ", wide=" + wide + ", getLeght()=" + getLeght() + ", getWide()="
				+ getWide() + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Lenght: ");
		this.lenght = sc.nextDouble();
		System.out.print("Enter Wide: ");
		this.wide = sc.nextDouble();
	}

	@Override
	public void output() {
		System.out.println("Lenght: " + this.lenght + " Wide: " + this.wide + " Area: " + this.area() + " Perimeter: " + this.perimeter());
	}
	
}

class List{
	ArrayList<shape> list = new ArrayList<shape>();
	private int n;
	public List() {
		
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public List(ArrayList<shape> list, int n) {
		super();
		this.list = list;
		this.n = n;
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Shape: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Circle(C) or Rectangle(R)?");
			String c = sc.next();
			if(c.equals("C")) {
				circle cir = new circle();
				cir.input();
				list.add(cir);
			}
			else {
				rectangle rec = new rectangle();
				rec.input();
				list.add(rec);
			}
		}
	}
	public void output() {
		for(int i = 0; i < this.n; i++) {
			System.out.println(list.get(i));
		}
	}
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name to Remove: ");
		String s = sc.nextLine();
		for(int i = 0; i < this.n; i++) {
			if(list.get(i).getName().equals(s)) {
				list.remove(i);
				n--;
			}
		}
		System.out.print("List new: \n");
		for(int i = 0; i < this.n; i++ ) {
			System.out.println(list.get(i));
		}
	}
	public void find() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name to Find: ");
		String s = sc.nextLine();
		for(int i = 0; i < this.n; i++) {
			if(list.get(i).getName().equals(s)) {
				System.out.println(list.get(i));
			}
		}
	}
}
public class ontap {

	public static void main(String[] args) {
		List l = new List();
		l.input();
		l.output();
		l.remove();
		l.find();
	}

}
