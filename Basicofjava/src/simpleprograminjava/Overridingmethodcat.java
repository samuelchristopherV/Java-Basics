package simpleprograminjava;

public class Overridingmethodcat {
	public void animal() {
		System.out.println("cat is a meoww");
	}
public static void main(String[]args) {
	Dog obj = new Dog();
	obj.animal();
}
}
