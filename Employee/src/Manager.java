import java.util.Scanner;

public class Manager extends Employee {
	private String room;
	private double phu;
	Manager(){
		
	}
	Manager(String a, double b, String c, double d){
		super(a,b);
		this.room = c;
		this.phu = d;
	} 
	public String toString() {
		return super.toString() + " Phong ban: " + this.room + " Phu cap: " + this.phu;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public double getPhu() {
		return phu;
	}
	public void setPhu(double phu) {
		this.phu = phu;
	}
	public void inputM() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap phong ban: ");
		this.room = sc.nextLine();
		System.out.print("Nhap phu cap: ");
		this.phu = sc.nextDouble();
	}
	public void outputM() {
		super.output();
		System.out.println("Phong ban: " + this.room + " Phu cap: " + this.phu);
	}
	public void salaryM() {
		double sal = 1500000 * this.hs + this.phu;
		System.out.println("Luong: " + sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
