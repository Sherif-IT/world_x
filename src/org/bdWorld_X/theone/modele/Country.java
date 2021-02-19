package org.bdWorld_X.theone.modele;

public class Country {
		
		private String code;
		private String name;
		private int capital;
		private String code2;
		
		public  Country() {
		this("def","def",1,"def");
		}
		public Country( String cod, String nam, int cap, String cod2) {
			code = cod;
			name = nam;
			capital = cap;
			code2 = cod2;
			
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return the capital
		 */
		public int getCapital() {
			return capital;
		}
		/**
		 * @return the code2
		 */
		public String getCode2() {
			return code2;
		}
	
		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @param capital the capital to set
		 */
		public void setCapital(int capital) {
			this.capital = capital;
		}
		/**
		 * @param code2 the code2 to set
		 */
		public void setCode2(String code2) {
			this.code2 = code2;
		}
		@Override
		public String toString() {
			return "Country [code=" + code + ", name=" + name + ", capital=" + capital + ", code2=" + code2 + "]";
		}
	
}
