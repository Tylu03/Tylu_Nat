package fc1_b01;

import java.util.Scanner;
class ptb1 {
	double hsb1,hsb0;
	ptb1(){}
	ptb1(double c, double d){
		this.hsb1 = c;
		this.hsb0 = d;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hsb1: ");this.hsb1 = sc.nextDouble();	
		System.out.print("Nhap hsb0: ");this.hsb0 = sc.nextDouble();
		
	}
	void conslove() {
		System.out.println("PTB1: " + this.hsb1 +".x +" + this.hsb0 + " =0");
		if(this.hsb1 == 0)
			System.out.println("Vo Nghiem!");
		else
			System.out.println("Phuong Trinh co nghiem la: " + (-this.hsb0/this.hsb1));
	}
}
public class ptb2 extends ptb1 {
	double hsb2;
	ptb2(){
		this.hsb0 = 0;
		this.hsb1 = 0;
		this.hsb2 = 0;
	}
	ptb2(double a, double b, double c){
		super(b,c);
		this.hsb2 = a;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hsb2: "); this.hsb2 = sc.nextDouble();
		super.input();
	}
	void conslove() {
		if(this.hsb2 == 0) {
			System.out.println("La PTB1");super.conslove();
		}
		else {
			System.out.println("Giai PTB2");
			double d = this.hsb1 * this.hsb1 - 4 * this.hsb0 * this.hsb2;
			if(d == 0) {
				System.out.print("PT co nghiem kep: " + (- this.hsb1/ (2 * this.hsb2)));
			}
			else if( d > 0) {
				System.out.print("PT co nghiem 1 la: " + ((- this.hsb1 + Math.sqrt(d))/ (2 * this.hsb2)));
				System.out.print("\nPT co nghiem 2 la: " + ((- this.hsb1 - Math.sqrt(d))/ (2 * this.hsb2)));

			}
			else {
				System.out.print("PT vo nghiem");
			}
		}
			
	}
	public static void main(String[] args) {
		ptb2 pt = new ptb2();
		pt.input();
		pt.conslove();
	}

}
