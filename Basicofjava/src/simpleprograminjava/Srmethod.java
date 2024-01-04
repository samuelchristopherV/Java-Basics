package simpleprograminjava;

public class Srmethod {
public static void main(String[]args) {
	String color = "yellow";
	char result = color.charAt(4);
	System.out.println(result);
	
	String first ="samuel";
	String last = "V";
	String results = first.concat(last);
	System.out.println(results);
	
	String second = "virat";
	System.out.println(second.contains("c"));
	System.out.println(second.contains("i"));
	
	String third = "so beautiful so elegent";
	System.out.println(third.indexOf("el"));
	System.out.println(third.toUpperCase());
	System.out.println(third.toLowerCase());
	
	String four = "white is a royal color";
	System.out.println(four.length());
	
	String five = "gayle";
	String five1 = "";
	System.out.println(five.isEmpty());
	
	String six = "most beautiful feel in the world";
	System.out.println(six.replace("feel","deal"));
	
	
	
	
	
}
}
