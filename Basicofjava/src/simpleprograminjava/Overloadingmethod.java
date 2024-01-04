package simpleprograminjava;

public class Overloadingmethod {
	
	public void studet(int id) {
		System.out.println(id);
	}
	public void studet(String name) {
		System.out.println(name);
	}
	public void studet(float salary) {
		System.out.println(salary);
	}
public static void main(String[]args) {
	Overloadingmethod obj = new Overloadingmethod();
	obj.studet(121);
	obj.studet("samuel");
	obj.studet(30000);
}
}
