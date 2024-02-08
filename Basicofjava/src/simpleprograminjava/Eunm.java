package simpleprograminjava;

public class Eunm {
	enum level{
		easy,
		medium,
		hard
	}
	
	public static void main(String[]args) {
		
		level med = level.medium;
		level eas = level.easy;
		
		System.out.println(med);
		System.out.println(eas);
	}

}
