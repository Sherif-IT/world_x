package org.bdWorld_X.theone.stockage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.DriverManager;
public class MySqlDbFactory extends DaoFactory {

	public static final String URL= "jdbc:mysql://localhost/world_x";
	
	MySqlDbFactory(){
	}
	public static Connection createConnection() {
		  Connection conn = null;
		  try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Properties props = new Properties();
			    props.setProperty("user", "admin2");
			    props.setProperty("password", "admini");
			    props.setProperty("ssl", "false");
			    conn = DriverManager.getConnection(URL, props);
			    
		  } catch (SQLException e) {
			  e.printStackTrace();
		  } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		  return conn;	
	  }
	  
	@Override
	public Dao getCityDao() {
		return new MySqlCityDAO();
	}
	@Override
	public Dao getCountryDao() {
		return new MySqlCountryDAO();
	}
	

}
