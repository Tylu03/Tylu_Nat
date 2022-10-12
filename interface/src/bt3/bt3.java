package bt3;

import java.util.Scanner;

abstract class Person {
	protected String code;
	protected String name;
	protected int rank;

	public Person(String code, String name, int rank) {
		this.code = code;
		this.name = name;
		this.rank = rank;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public abstract String description();

	public void display() {
		System.out.println("Employee code:" + code);
		System.out.println("Employee name:" + name);
		System.out.println("Rank:" + rank);
	}
}

class professor extends Person {
	private String department;

	public professor(String code, String name, int rank, String department) {
		super(code, name, rank);
		this.department = department;
	}

	@Override
	public String description() {
		String c = "";
		if (this.getRank() == 0)
			c = "None";
		else if (this.getRank() == 1) {
			c = "Assistant Professor";
		} else if (this.getRank() == 2) {
			c = "Associate Professor";
		} else if (this.getRank() == 3) {
			c = "Professor";
		} else if (this.getRank() == 4) {
			c = "Assistant Teaching Professor";
		} else if (this.getRank() == 5) {
			c = "Associate Teaching Professor";
		} else if (this.getRank() == 6) {
			c = "Teaching Professor";
		}
		return c;
	}

	public void display() {
		super.display();
		System.out.println("Department: " + this.department);
	}
}

class student extends Person {
	private String dP;
	private int yG;

	public student(String code, String name, int rank, String dP, int yG) {
		super(code, name, rank);
		this.dP = dP;
		this.yG = yG;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		String c="";
		if(this.getRank() == 0) {
			c = "None";
		}
		else if(this.getRank() == 1) {
			c =  "Freshman";
		}
		else if(this.getRank() == 2) {
			c =  "Sophomore";	
		}
		else if(this.getRank() == 3) {
			c =  "Junior";
		}
		else if(this.getRank() == 4) {
			c =  "Senior";
		}
		else if(this.getRank() == 5) {
			c =  "Graduate";
		}
		else if(this.getRank() == 6) {
			c =  "Masters Postgraduate";
		}
		else if(this.getRank() == 7) {
			c =  "PhD Postgraduate";
		}
		return c;
	}
	public void display() {
		super.display();
		System.out.println("Degree Program: " + this.dP);
		System.out.println("Years of Graduation: " + this.yG);
	}
}
class PersonList{
	Person[] person;
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public PersonList(Person[] person, int n) {
		super();
		this.person = person;
		this.n = n;
	}
	public void display() {
		for(int i = 0; i < person.length; i++) {
			person[i].display();
		}
	}
	public int average() {
		int sum = 0;
		for(int i = 0; i < person.length; i++) {
			sum += person[i].getRank();
		}
		int avg = sum / person.length ;
		return avg;
	}
	public void maxR() {
		Person max = person[0];
		for(int i = 0; i < person.length - 1; i++) {
			if(person[i].getRank() < person[i+1].getRank()) {
				max = person[i+1];
			}
		}
		max.display();
	}
	void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Code: ");
		String c = sc.nextLine();
		for(int i = 0; i < person.length; i++) {
			if(person[i].getCode() == c) {
				Person []tmp = new Person[person.length - 1];
				for(int j = 0, k = 0; j <person.length-1; j++) {
					if(j == i)continue;
					tmp[k++] = person[j];
				}
				person = tmp;
				break;
			}
		}
	}
}
public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
