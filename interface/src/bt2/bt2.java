package bt2;

import java.util.Scanner;

class bill{
	private String type ;
	private int code, oldindex, newindex;
	bill(){
		
	}
	bill(String a, int b, int c, int d){
		this.type = a; 
		this.code = b;
		this.oldindex = c;
		this.newindex = d;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getOldindex() {
		return oldindex;
	}
	public void setOldindex(int oldindex) {
		this.oldindex = oldindex;
	}
	public int getNewindex() {
		return newindex;
	}
	public void setNewindex(int newindex) {
		this.newindex = newindex;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter code of cus: ");
		this.code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter type of cus: ");
		this.type = sc.nextLine();
		System.out.print("Enter old index: ");
		this.oldindex = sc.nextInt();
		System.out.print("Enter new index: ");
		this.newindex = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "bill [type=" + type + ", code=" + code + ", oldindex=" + oldindex + ", newindex=" + newindex + "]";
	}
	int price() {
		if(this.type.equals("Resident")) {
			return 500;
		}
		else if(this.getType().equals("Business") || this.getType().equals("Organization")) {
			return 400;
		}
		else {
			return 300;
		}
	}
	int payment() {
		return this.price() * (this.getNewindex() - this.getOldindex());
	}
}
class BillList{
	private int n;
	bill []b;
	BillList() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Bills: ");
		this.n = sc.nextInt();
		sc.nextLine();
		this.b = new bill[n];
		for(int i = 0; i < this.n; i++) {
			this.b[i] = new bill();
			this.b[i].input();
		}
	}
	BillList(int a){
		this.n = a;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public bill[] getB() {
		return b;
	}
	public void setB(bill[] b) {
		this.b = b;
	}
	void output() {
		for(int i = 0; i < this.b.length; i++) {
			System.out.println(b[i]);
		}
	}
	int total() {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Type: ");
		String s = sc.nextLine();
		for(int i = 0; i < this.getN(); i++) {
			if(b[i].getType().equals(s)) {
				total += b[i].payment();
			}
		}
		return total;
	}
	void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Code: ");
		int c = sc.nextInt();
		for(int i = 0; i < b.length; i++) {
			if(b[i].getCode() == c) {
				bill []x = new bill[b.length - 1];
				for(int j = 0, k = 0; j <b.length; j++) {
					if(j == i)continue;
					x[k++] = b[j];
				}
				b = x;
				break;
			}
			
		}
	}
	void maxPay() {
		bill temp = b[0];
		for(int i = 0; i < b.length -1; i++) {
			if(temp.payment() < b[i].payment()) {
				temp = b[i];
			}
		}
		System.out.println("Bill maxPayment: ");
		System.out.println(temp);
	}
}
public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillList Bill = new BillList();
		Bill.remove();
		Bill.output();
		Bill.maxPay();
	}

}
