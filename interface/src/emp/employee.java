package emp;
public class employee implements Comparable<employee> {
	private int age;
	employee(){
		
	}
	employee(int a){
		this.age = a;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(employee e) {
		if(this.getAge() == e.getAge())
			return 0;
		else if(this.getAge() > e.getAge())
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		employee e1 = new employee(8);
		employee e2 = new employee(9);
		System.out.println(e1.compareTo(e2));
	}

}
