package simpleprograminjava;
import java.util.HashSet;

public class Hashsetcollection {
public static void main(String[]args) {
	HashSet<String> color = new HashSet<String>();
	color.add("gray");
	color.add("green");
	color.add("brown");
	System.out.println(color);
	System.out.println(color.contains("green"));
}
}
