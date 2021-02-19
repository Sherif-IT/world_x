package org.bdWorld_X.theone.stockage;

/**
 * proposition de solution pour choisir mode de stockage entre la BDD et un fichier
 * @author sheri
 *
 */

public abstract class DaoFactory {
	public  static final int MYSQL = 1;
	public static final int FICHIER = 2;

	
	
	
	/**
	 * 
	 */
	public DaoFactory() {
	}

	public abstract Dao getCountryDao();
	public abstract Dao getCityDao();

	public static DaoFactory getDaoFactory(int factory) {
		switch (factory) {
		case 1: {
		 
			return  new MySqlDbFactory();
		}
		case 2: {
			return  new FichierFactory();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + factory);
		}

	}
}
