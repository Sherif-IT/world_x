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

public class MySqlCountryDAO implements Dao<Country>{

	@Override
	public void inserer(Country obj) {
        
        String sql = "INSERT INTO country(Code,Name,Capital, Code2) VALUES(?,?,?,?)";

        try {	
        	Connection conn = MySqlDbFactory.createConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, obj.getCode());
            pstmt.setString(2,obj.getName());

            pstmt.setInt(3, obj.getCapital());

            pstmt.setString(4, obj.getCode2());
            pstmt.execute();
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
		}

		
		
	}


	@Override
	public ArrayList<Country> lireTous() {
		ArrayList<Country> countries = new ArrayList<Country>();
		try {
			Connection conn = MySqlDbFactory.createConnection();
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("select Code, Name, Capital, Code2 from country    ; ");
			while (res.next()) {
				String code = res.getString(1);
				String name = res.getString(2);
				int capital =  res.getInt(3);
				String code2 =  res.getString(4);
				Country country = new Country(code,name,capital,code2);
				//System.out.println(city);
				countries.add(country);
			}
		}catch (SQLException e) {

			e.printStackTrace();		
			}
		return countries;
	}


}
