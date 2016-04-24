package be.odisee.LetsFace.domain;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:38
 */
public class Contactgegevens {

	private Locatie adres;
	private String email;
	private int id;
	private String status;
	private String telefoonnummer;

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param email
	 * @param adres
	 * @param id
	 * @param status
	 * @param telefoonnummer
	 */
	public Contactgegevens(String email, Locatie adres, int id, String status, String telefoonnummer){
            this.email = email;
            this.adres = adres;
            this.id = id;
            this.status = status;
            this.telefoonnummer = telefoonnummer;
	}

	public Locatie getAdres(){
		return this.adres;
	}

	public String getEmail(){
		return this.email;
	}

	public int getId(){
		return this.id;
	}

	public String getStatus(){
		return this.status;
	}

	public String getTelefoonnummer(){
		return this.telefoonnummer;
	}

	/**
	 * 
	 * @param adres    adres
	 */
	public void setAdres(Locatie adres){
            this.adres = adres;
	}

	/**
	 * 
	 * @param email    email
	 */
	public void setEmail(String email){
            this.email = email;
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
	 * @param status
	 */
	public void setStatus(String status){
            this.status = status;
	}

	/**
	 * 
	 * @param telefoonNummer    telefoonNummer
	 */
	public void setTelefoonnummer(String telefoonNummer){
            this.telefoonnummer = telefoonnummer;
	}

}