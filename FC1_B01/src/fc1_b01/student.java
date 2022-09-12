package fc1_b01;

import java.util.Scanner;
public class student {
	String name, que;
	double avg;
	int mssv;
	student(String a, double b, int c, String d)
	{
		this.avg = b;
		this.name = a;
		this.que = d;
		this.mssv = c;
	}
	student()
	{
		this.avg = 0;
		this.name = " ";
	}
	void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.println("Nhap mssv: ");
		this.mssv = sc.nextInt();
		System.out.println("Nhap diem");
		this.avg = sc.nextDouble();
		
	}
	void in()
	{
		System.out.println("Ten: " + this.name);
		System.out.println("Diem: " + this.avg);
	}
//	public static class lop{
//		String tenlop;
//		
//		student[]sv = new student[10];
//		int n;
//		lop(String a)
//		{
//			this.tenlop = a;
//			
//		}
//		public lop()
//		{
//			this.tenlop = " ";
//		}
//		void nhapRa()
//		{
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("nhap ten lop: ");
//			this.tenlop = sc.nextLine();
//			System.out.println("Nhap so sinh vien: ");
//			this.n = sc.nextInt();
//			sc.nextLine();
//			for(int i = 0; i < n; i++)
//			{
//				sv[i] = new student();
//				sv[i].nhap();
//				
//						
//			}
//		}
//		void inRa()
//		{
//			for(int i = 0; i < n; i++)
//			{
//				this.sv[i].in();
//			}
//		}
//		
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lop l = new lop();
//		l.nhapRa();
//		l.inRa();
	}
	

}


