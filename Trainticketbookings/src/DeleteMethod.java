import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteMethod {
	public  static void delete()throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/pain";
		String username = "root";
		String password = "samuels";
		String Query = "delete from Railwaytickets where train_name = 'cheran SF'";
		Connection con = DriverManager.getConnection(url, username, password );
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		pst.close();
		
	}
	
	
	
public static void main(String[]args)throws Exception {
   delete();
}
}


