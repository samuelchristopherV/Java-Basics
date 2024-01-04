package simpleprograminjava;

public class Daughter extends Father {
	public void education() {
		System.out.println("developer");
	}
public static void main(String[]args) {
	Daughter obj = new Daughter();
	obj.bussiness();
	obj.Vechile();
	obj.education();
	obj.properties();
}
}
