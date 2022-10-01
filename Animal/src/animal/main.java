package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	ArrayList<Animal> array = new ArrayList<>();
	int n;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Animal: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dog(D) or Cat(C)? ");
			String c = sc.next();
			if(c.equals("D")) {
				Dog dog = new Dog();
				dog.inputD();
				array.add(dog);
			}else {
				Cat cat = new Cat();
				cat.inputC();
				array.add(cat);
			}
		}
	}
	public void output() {
		for(int i = 0; i < n; i++) {
			System.out.println(array.get(i));
		}
	}
	public static void main(String[] args) {
		main m = new main();
		m.input();
		m.output();

	}

}
