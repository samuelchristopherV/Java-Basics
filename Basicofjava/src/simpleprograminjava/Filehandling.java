package simpleprograminjava;
import java.io.File;
import java.io.IOException;

public class Filehandling {
public static void main(String[]args) {	
	try {
		File obj = new File("C:\\Users\\91638\\Desktop\\sample");
		if (obj.createNewFile()) {
			System.out.println("file created");
		}else {
			System.out.println("file not created");
		}
	}catch(IOException e) {
		System.out.println("error occured");
		e.printStackTrace();
	}

}
}