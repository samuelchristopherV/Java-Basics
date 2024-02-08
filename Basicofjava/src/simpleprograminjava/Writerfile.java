package simpleprograminjava;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Writerfile {
	public static void main(String[]args) {
		try {
			FileWriter obj = new FileWriter("C:\\Users\\91638\\Desktop\\sample");
			obj.write("This is very simple java file");
			obj.close();
		}catch(IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
