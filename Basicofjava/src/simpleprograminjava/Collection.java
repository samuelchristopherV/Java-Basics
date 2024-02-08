package simpleprograminjava;
import java.util.ArrayList;

public class Collection {
public static void main(String[]args) {
	ArrayList<String> color = new ArrayList<String>();
	color.add("pink");
	color.add("yellow");
	color.add("purple");
	color.set(2, "black");
	color.remove(1);
	System.out.println(color);
	System.out.println(color.get(0));
}
}
