package book;

import java.sql.Connection;
import java.sql.DriverManager;


public class printStudents {
	String sql;
	int tulos;
	

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public int getTulos() {
		return tulos;
	}

	public void setTulos(int tulos) {
		this.tulos = tulos;
	}

	@Override
	public String toString() {
		return "printStudents [sql=" + sql + ", tulos=" + tulos + "]";
	}
	public printStudents(String sql, int tulos) {
		super();
		this.sql = sql;
		this.tulos = tulos;
	}
	public static void main(String args[]) {
		// Create connection to database (conn)
		Connection conn = null;
		try {			
			conn = DriverManager.getConnection(DbYhteys.url, DbYhteys.user, DbYhteys.passwd);

			// 2. Query database
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from oppilas");

			while (rs.next()) {
				// retrieve and print the values for the current database row
				int id = rs.getInt("Id");
				// TODO: fetch: Nimi, Demopisteet, Koepisteet
				System.out.println(id + "\t" + nimi + "\t" + demo + "\t" + koe);
			}

			conn.close(); // close connection

		// etc. error handling code
    
		}
}
