package simpleprograminjava;
import java.util.HashMap;

public class Hashcollectionmap {
public static void main(String[]args) {
	HashMap < String,String> cont = new HashMap<String,String>();
	cont.put("india","delhi");
	cont.put("Australia","Syndey");
	cont.put("england", "londan");
	//cont.remove("india");
	//cont.replace("india","chennai");
	System.out.println(cont);
	System.out.println(cont.get("england"));
	}
}
