package simpleprograminjava;
import java.io.File;

public class Deletefiles {
public static void main(String[]args) {
	File myobj = new File("C:\\Users\\91638\\Desktop\\sample");
	if(myobj.delete()) {
		System.out.println("file deleted");
	}else {
		System.out.println("error occured");
	} 
}
}
