import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Getbymethod {
	public static void get()throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/pain";
		String username ="root";
		String password ="samuels";
		String Query = "select* from Railwaytickets where train_name ='Kaveri SF'";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		while (rs.next()) {
			System.out.println("train_name: " + rs.getString(1));
			System.out.println("no_of_seat: " + rs.getInt(2));
			System.out.println("station_from: "+rs.getString(3));
			System.out.println("Reservation_upto: "+rs.getString(4));
			System.out.println("ticket_price: "+rs.getInt(5));
		}
		con.close();	
	}
	
	
	
	
	
	
	
public static void main(String[]args)throws Exception {
	get();
}
}

