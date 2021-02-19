/**
 * 
 */
package org.bdWorld_X.theone.stockage;

import java.util.ArrayList;
import java.util.List;

import org.bdWorld_X.theone.modele.City;
import org.bdWorld_X.theone.modele.Country;


/**
 * @author sheri
 *
 */
public interface  Dao <T> {
		public void inserer(T obj);
		public ArrayList<T> lireTous() ;
}
