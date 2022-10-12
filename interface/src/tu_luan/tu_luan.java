package tu_luan;

import java.util.Scanner;

interface ITIENDIEN{
	double TinhThanhTien();
}
abstract class KHACHHANG implements ITIENDIEN{
	private int code;
	private String name;
	private String date;
	private int number;
	private int price;
	public KHACHHANG() {
		// TODO Auto-generated constructor stub
	}
	public KHACHHANG(int code, String name, String date, int number, int price) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
		this.number = number;
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Code: ");
		this.code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter Date: ");
		this.date = sc.nextLine();
		System.out.print("Enter Number: ");
		this.number = sc.nextInt();
		System.out.print("Enter Price: ");
		this.price= sc.nextInt();
	}
	@Override
	public String toString() {
		return "KHACHHANG [code=" + code + ", name=" + name + ", date=" + date + ", number=" + number + ", price="
				+ price + "]";
	}
	
}
class KHACHHANGVIETNAM extends KHACHHANG{
	private String type;
	private int norm;
	public KHACHHANGVIETNAM() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Type: ");
		this.type = sc.nextLine();
		System.out.print("Enter Norm: ");
		this.norm = sc.nextInt();
		// TODO Auto-generated constructor stub
	}
	public KHACHHANGVIETNAM(int code, String name, String date, int number, int price, String type, int norm) {
		super(code, name, date, number, price);
		this.type = type;
		this.norm = norm;
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNorm() {
		return norm;
	}

	public void setNorm(int norm) {
		this.norm = norm;
	}
	@Override
	public String toString() {
		return "KHACHHANGVIETNAM [" + super.toString() +", type=" + type + ", norm=" + norm + "]";
	}
	@Override
	public double TinhThanhTien() {
		double pay;
		if(this.getNumber() <= this.getNorm()) {
			pay = this.getNumber() * this.getPrice();
		}
		else {
			pay = this.getNumber() * this.getPrice() * this.getNorm() + (this.getNumber() - this.getNorm()) * this.getPrice() *2.5;
		}
		return pay;
	}
	
}
class KHACHHANGNUOCNGOAI extends KHACHHANG{
	private String nationality;
	public KHACHHANGNUOCNGOAI() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nationality: ");
		this.nationality = sc.nextLine();
		// TODO Auto-generated constructor stub
	}
	public KHACHHANGNUOCNGOAI(int code, String name, String date, int number, int price, String nationality) {
		super(code, name, date, number, price);
		this.nationality = nationality;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "KHACHHANGNUOCNGOAI [" + super.toString() +", nationality=" + nationality + "]";
	}
	@Override
	public double TinhThanhTien() {
		double pay = this.getNumber() * this.getPrice();
		return pay;
	}
}
class DSKHACHHANG{
	private int n;
	KHACHHANG [] kh ;
	public DSKHACHHANG() {
		// TODO Auto-generated constructor stub
	}
	public DSKHACHHANG(KHACHHANG[] kh, int n) {
		super();
		this.kh = kh;
		this.n = n;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of customer: ");
		this.n = sc.nextInt();
		this.kh = new KHACHHANG[n];
		for(int i = 0; i < kh.length; i++) {
			System.out.print("VN(V) or Foreign(F)?");
			String c = sc.next();
			if(c.equals("V")) {
				kh[i] = new KHACHHANGVIETNAM();
			}
			else {
				kh[i] = new KHACHHANGNUOCNGOAI();
			}
		}
	}
	public void find() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Code to Find: ");
		int k = sc.nextInt();
		for(int i = 0; i < kh.length; i++) {
			if(kh[i].getCode() == k) {
				System.out.println("Find Customer:");
				System.out.print(kh[i]);
			}
		}
	}
	public void rename() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name to Rename: ");
		String s = sc.nextLine();
		System.out.print("Enter New Name: ");
		String s1 = sc.nextLine();
		for(int i = 0; i < kh.length; i++) {
			if(kh[i].getName().equals(s)) {
				kh[i].setName(s1);
				System.out.print("\n" + kh[i]);
			}
			
		}
	}
	public void sort() {
		System.out.println("\nSort: ");
		for(int i = 0; i < kh.length - 1; i++) {
			for(int j = i + 1; j < kh.length; j++) {
				if(kh[i].TinhThanhTien() < kh[j].TinhThanhTien()) {
					KHACHHANG tmp = kh[i];
					kh[i] = kh[j];
					kh[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < kh.length; i++) {
			System.out.print("\n"+ kh[i]);
		}
	}
}
public class tu_luan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSKHACHHANG list = new DSKHACHHANG();
		list.input();
		list.find();
		list.sort();
		list.rename();
	}

}
