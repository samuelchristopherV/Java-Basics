import java.sql.*;

public class Insertmethod {
	public static void insert()throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/pain";
		String username = "root";
		String password = "samuels";
		String Query = "insert into Railwaytickets values(?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password );
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1, "Yelagiri SF");
		pst.setInt(2, 06);
		pst.setString(3, "Chennai");
		pst.setString(4, "Coimbatore");
		pst.setInt(5, 835);
		pst.executeUpdate();
		pst.close();
		
	}
	
	
	
public static void main(String[]args)throws Exception {
   insert();
}
}