package org.bdWorld_X.theone.stockage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.bdWorld_X.theone.modele.City;
import org.bdWorld_X.theone.modele.Country;

public class MySqlCityDAO implements Dao <City>{

	@Override
	public void inserer(City obj) {
  
        
        String sql = "INSERT INTO city(Name,CountryCode,District, Info) VALUES(?,?,?,?)";

        try {	
        	Connection conn = MySqlDbFactory.createConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,obj.getName());
            pstmt.setString(2, obj.getCountry().getCode());
            pstmt.setString(3, obj.getDistrict());
            pstmt.setString(4, obj.getInfo());
            pstmt.execute();
			conn.close();

        }catch (SQLException e) {
            System.out.println(e.getMessage());
		}

		
	}



	@Override
	public ArrayList<City> lireTous() {
		ArrayList<City> cities = new ArrayList<City>();
		
		try {
			Connection conn = MySqlDbFactory.createConnection();
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("select ID, city.Name, Code, District, Info, Capital,Code2,country.Name from city INNER JOIN country ON Code= CountryCode ; ");
			while (res.next()) {

				String codeCountry = res.getString(3);
				int cap = res.getInt(6);
				String code2 = res.getString(7);
				String name = res.getString(8);
				
				Country country =  new Country(codeCountry,name,cap, code2 );
				int idCity = res.getInt(1);
				String cName = res.getString(2);
				String district =  res.getString(4);
				String info =  res.getString(5);
				
				City city = new City(idCity,cName,country,district,info);

				cities.add(city);
			}
			conn.close();

		}catch (SQLException e) {

			e.printStackTrace();		
			}
		return cities;
	}



}
