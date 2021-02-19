/**
 * 
 */
package org.bdWorld_X.theone.stockage;

/**
 * @author sheri
 *
 */
public class FichierFactory extends DaoFactory {
	protected FichierFactory() { 
	}
	/**
	 * @return the instance
	 */
	
	@Override
	public Dao getCityDao() {
		return new FichierCityDao();
	}
	@Override
	public Dao getCountryDao() {
		return new FichierCountryDao();
	}

}
