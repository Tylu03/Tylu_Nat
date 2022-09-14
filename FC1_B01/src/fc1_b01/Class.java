package fc1_b01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class SV {
	private
	String name, que;
	int mssv;
	
	double avg;
	SV(String a, int b, double c, String d)
	{
		this.name = a;
		this.mssv = b;
		this.avg = c;
		this.que = d;
	}
	SV()
	{
		this.name = " ";
		this.mssv = 0;
		this.avg = 0;
		this.que = " ";
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.print("Nhap MSSV: ");
		this.mssv = sc.nextInt();
		System.out.print("Nhap diem: ");
		this.avg = sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhap que: ");
		this.que = sc.nextLine();
		
	}
	public void output() {
		System.out.println("Ten: " + name);
		System.out.println("MSSV: " + mssv);
		System.out.println("AVG: " + avg);
		System.out.println("Que: " + que);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String toString() {
		return name + " " + mssv + " " + avg + " " + que;
	}
	public static void main(String[] args) {
		
	}

}
public class Class {
	private
	String tenlop;
	int n;
	Class(String a, int b){
		this.tenlop = a;
		this.n = b;
	}
	Class(){
		this.tenlop = " ";
		this.n = 0;
	}
	ArrayList <SV> l = new ArrayList<SV>();
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ten lop: ");
		this.tenlop = sc.nextLine();
		System.out.print("Nhap so hoc sinh: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			SV sv = new SV();
			sv.input();
			l.add(sv);
		}
	}
	public void out() {
		System.out.print("Danh sach lop" + tenlop + ":");
		for(int i = 0; i < l.size(); i++) {
			System.out.print("\t" + l.get(i));
		}
	}
	public void mark() {
		for(int i = 0; i < l.size(); i++) {
			if(l.get(i).getQue() == "Quang Nam") {
				l.get(i).setAvg(l.get(i).getAvg()+ 0.3f);
			}
		}
	}
	public void  sort() {
		l.sort(Comparator.comparing(SV::getName));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class lop = new Class();
		lop.in();
		lop.out();
		lop.sort();
		lop.out();
	}

}
