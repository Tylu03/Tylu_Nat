package exp;
interface printble{
	void print();
}
interface showable{
	void show();
}
class A implements printble, showable{
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
	}

}
