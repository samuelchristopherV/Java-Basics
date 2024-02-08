package simpleprograminjava;
import java.util.LinkedList;

public class LInkcollection {
public static void main(String[]args) {
	LinkedList<String> color = new LinkedList<String>();
	color.add("pink");
	color.add("orange");
	color.add("yellow");
	color.addFirst("white");
	color.addLast("black");
	color.removeFirst();
	System.out.println(color);
}
}
