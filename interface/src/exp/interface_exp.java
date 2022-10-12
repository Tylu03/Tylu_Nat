package exp;
interface printable{
	void print();
}
// interface co the extends nhau de co the implement 1 cai cho ngan gon
interface showable extends printable{
	void show();
}
class A implements showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
}
public class interface_exp {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.show();
		// co the tao doi tuong interface cho lop implement
		printable b = new A();
	}

}
