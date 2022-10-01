import java.util.ArrayList;
import java.util.Scanner;

class NV{
	String name;
	double hs;
	NV(){
		
	}
	NV(String a, double b){
		this.name = a;
		this.hs = b;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten: ");
		this.name = sc.nextLine();
		System.out.println("Nhap he so Luong: ");
		this.hs = sc.nextDouble();
	}
	void in() {
		System.out.println("Ten: " + name + " He so: " + hs);
	}
	void salary() {
		hs = hs * 1500;
		System.out.println("Luong: " + hs);
	}
	public String toString() {
		return "Ten: " + this.name + " He so: " + this.hs;
	}
}
class QL extends NV{
	String cv;
	double pc;
	QL(){
		
	}
	QL(String a, double b, String c, double d){
		super(a,b);
		this.cv = c;
		this.pc = d;
	}
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Chuc vu: ");
		this.cv = sc.nextLine();
		System.out.println("Nhap Phu cap: ");
		this.pc = sc.nextDouble();
	}
	void in() {
		super.in();
		System.out.print("Chuc vu: " + cv + " Phu cap: " + pc);
	}
	void Salary() {
		double k = this.hs *1500 + this.pc;
		System.out.println("Luong: "+ k);
	}
}
public class Test_PTA {
	int n;
	ArrayList<NV> a = new ArrayList<>();
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguoi: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Employee(E) or Manager(M)? ");
			String c = sc.next();
			if(c.equals("E")) {
				NV nv = new NV();
				nv.nhap();
				a.add(nv);
			}else {
				QL ql = new QL();
				ql.nhap();
				a.add(ql);
			}
		}
	}
	void inE() {
		for(int i = 0; i < n; i++) {
			if(a.get(i).getClass().getSimpleName().equals("NV")) {
				a.get(i).in();
			}
		}
	}
	public static void main(String[] args) {
		Test_PTA test = new Test_PTA();
		test.nhap();
		test.inE();
	}

}
