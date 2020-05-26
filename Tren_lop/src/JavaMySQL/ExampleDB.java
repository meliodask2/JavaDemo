
package JavaMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleDB {
	final static String nameDriver = "com.mysql.cj.jdbc.Driver";
	final static String url = "jdbc:mysql://localhost:3306/sinhvien";
	final static String user = "root";
	final static String password = "Nguyenan118";

	public static void main(String[] args) {
		Connection connection = null; // 031-12111-12 SHE IS HEO
		Statement statement = null;
		try {// jdbc:mysql://localhost:3306/?user=root
			Class.forName(nameDriver);
			System.out.println("ok");
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			System.out.println("abc");
			ResultSet result1 = statement.executeQuery("SELECT idMaSV,MaSV FROM sinhvien.thongtin");
			while (result1.next()) {
				int id = result1.getInt("idMaSV");
				String MaSV = result1.getString("MaSV");
				System.out.println(id + " - " + MaSV);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}