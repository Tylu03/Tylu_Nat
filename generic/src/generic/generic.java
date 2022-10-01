package generic;
abstract class number<T> {
	abstract T add(T num1, T num2);

	abstract T subtract(T num1, T num2);

	abstract T multifly(T num1, T num2);

	abstract T devide(T num1, T num2);
}

class fraction extends number<fraction> {
	private int tu, mau;

	fraction() {

	}

	fraction(int a, int b) {
		this.tu = a;
		this.mau = b;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}
	public String toString() {
		return tu + "/" + mau;
	}
	int uscln(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;

		}
		return a;

	}

	void rutgon(fraction f) {
		int k = uscln(f.tu, f.mau);
		f.tu /= k;
		f.mau /= k;
	}

	@Override
	fraction add(fraction num1, fraction num2) {
		fraction f = new fraction();
		f.setTu(num1.getTu() * num2.getMau() + num2.getTu() * num1.getMau());
		f.setMau(num1.getMau() * num2.getMau());
		rutgon(f);
		return f;
	}

	@Override
	fraction subtract(fraction num1, fraction num2) {
		fraction f = new fraction();
		f.setTu(num1.getTu() * num2.getMau() - num2.getTu() * num1.getMau());
		f.setMau(num1.getMau() * num2.getMau());
		rutgon(f);
		return f;
	}

	@Override
	fraction multifly(fraction num1, fraction num2) {
		fraction f = new fraction();
		f.setTu(num1.getTu() * num2.getTu());
		f.setMau(num1.getMau() * num2.getMau());
		rutgon(f);
		return f;
	}

	@Override
	fraction devide(fraction num1, fraction num2) {
		fraction f = new fraction();
		f.setTu(num1.getTu() * num2.getMau());
		f.setMau(num1.getMau() * num2.getTu());
		rutgon(f);
		return f;
	}

}
class complex extends number<complex>{
	private int a,b;
	complex(){
		
	}
	complex(int m, int n){
		this.a = m;
		this.b = n;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	complex add(complex num1, complex num2) {
		complex c = new complex();
		c.setA(num1.getA() + num2.getA());
		c.setB(num1.getB() + num2.getB());
		return c;
	}

	@Override
	complex subtract(complex num1, complex num2) {
		complex c = new complex();
		c.setA(num1.getA() - num2.getA());
		c.setB(num1.getB() - num2.getB());
		return c;
	}

	@Override
	complex multifly(complex num1, complex num2) {
		complex c = new complex();
		c.setA( num1.getA() * num2.getA() - num1.getB() * num2.getB());
		c.setB( num1.getA() * num2.getB() + num1.getB() * num2.getA());
		return c;
	}

	@Override
	complex devide(complex num1, complex num2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
