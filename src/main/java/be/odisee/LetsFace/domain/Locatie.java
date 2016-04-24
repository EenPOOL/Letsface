package be.odisee.LetsFace.domain;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:38
 */
public class Locatie {

	private String adres;
	private String gemeente;
	private int id;
	private String land;
	private String postcode;
	private String status;

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param adres
	 * @param postcode
	 * @param gemeente
	 * @param land
	 * @param id
	 * @param status
	 */
	public Locatie(String adres, String postcode, String gemeente, String land, int id, String status){
            this.adres = adres;
            this.postcode = postcode;
            this.gemeente = gemeente;
            this.land = land;
            this.status = status;
	}

	public String getAdres(){
		return this.adres;
	}

	public String getGemeente(){
		return this.gemeente;
	}

	public int getId(){
		return this.id;
	}

	public String getLand(){
		return this.land;
	}

	public String getPostcode(){
		return this.postcode;
	}

	public String getStatus(){
		return this.status;
	}

	/**
	 * 
	 * @param adres    adres
	 */
	public void setAdres(String adres){
            this.adres = adres;
	}

	/**
	 * 
	 * @param gemeente    gemeente
	 */
	public void setGemeente(String gemeente){
            this.gemeente = gemeente;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
            this.id = id;
	}

	/**
	 * 
	 * @param land    land
	 */
	public void setLand(String land){
            this.land = land;
	}

	/**
	 * 
	 * @param postcode    postcode
	 */
	public void setPostcode(String postcode){
            this.postcode = postcode;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){
            this.status = status;
	}

}