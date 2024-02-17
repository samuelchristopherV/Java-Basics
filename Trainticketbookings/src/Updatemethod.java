import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatemethod {
	public  static void update()throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/pain";
		String username = "root";
		String password = "samuels";
		String Query = "update Railwaytickets set ticket_price = '1250' where train_name = 'Yelagiri SF'";
		Connection con = DriverManager.getConnection(url, username, password );
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		pst.close();
		
	}
	
	
	
public static void main(String[]args)throws Exception {
   update();
}
}

