import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("Employee(E) or Manager(M)? ");
		String c = sc.next();
		sc.nextLine();
		while(1 == 1) {
			if(c.equals("e")) {
				Employee emp = new Employee();
				emp.input();
				emp.output();
				emp.salary();
			}
			else {
				Manager man = new Manager();
				man.inputM();
				man.outputM();
				man.salaryM();
			}
			System.out.println("Continue(C) or Stop(S)? ");
			String a = sc.next();
			if(a.equals("S")) {
				break;
			}
		}
	}

}
