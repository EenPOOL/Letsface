package be.odisee.LetsFace.domain;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:38
 */
public class Beloning {

	private int id;
	private String naam;
	private String status;


	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param id
	 * @param status
	 * @param naam
	 */
	public Beloning(int id, String status, String naam){
            this.id = id;
            this.status = status;
            this.naam = naam;
	}

	public int getId(){
		return this.id;
	}

	public String getNaam(){
		return this.naam;
	}

	public String getStatus(){
		return this.status;
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
	 * @param naam
	 */
	public void setNaam(String naam){
            this.naam = naam;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){
            this.status = status;
	}

}