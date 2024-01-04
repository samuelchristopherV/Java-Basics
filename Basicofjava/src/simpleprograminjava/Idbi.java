package simpleprograminjava;

public class Idbi implements Bankings {
	public void current() {
		System.out.println("current account");
	}
	public void salary() {
		System.out.println("salary account");
	}
		public void savings() {
			System.out.println("savings account");
		}
		
public static void main(String[]args) {
	Idbi obj = new Idbi();
	obj.current();
	obj.salary();
	obj.savings();
	
	}
}

