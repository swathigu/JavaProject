import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void insertData() {
		
		Connection con = getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, 50);
			pst.setString(2, "Karthk");
			pst.setInt(3, 20000);
			pst.setInt(4, 20);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pst != null) {
					pst.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

	public void updateData() {
		
		Connection con = getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement("update employee set salary=30000 where eno=?");
			pst.setInt(1, 50);
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pst != null) {
					pst.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void getData() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		JDBCExample obj = new JDBCExample();

		obj.getData();
		obj.insertData();
		obj.updateData();

	}

}
