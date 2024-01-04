package simpleprograminjava;
import java.util.Scanner;

public class Sam {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the name");
		String name = obj.nextLine();
		System.out.println("username is :"+ name);
		int age=obj.nextInt();
		System.out.println("user age is :"+ age);
		
	}

}
