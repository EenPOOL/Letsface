package be.odisee.LetsFace.domain;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:37
 */
public class Prospect {

	private String achternaam;
	private int id;
	public Beloning m_Beloning;
	public Contactgegevens m_Contactgegevens;
	private String status;
	private String voornaam;

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param voornaam
	 * @param achternaam
	 * @param id
	 * @param status
	 * @param contactgegevens
	 * @param beloning
	 * @param opdracht
	 */
	public Prospect(String voornaam, String achternaam, int id, String status, Contactgegevens contactgegevens, Beloning beloning){
            this.voornaam = voornaam;
            this.achternaam = achternaam;
            this.id = id;
            this.status = status;
            this.m_Contactgegevens = contactgegevens;
            this.m_Beloning = beloning;
	}

	public String getAchternaam(){
		return this.achternaam;
	}

	public Beloning getBeloning(){
		return m_Beloning;
	}

	public Contactgegevens getContactgegevens(){
		return m_Contactgegevens;
	}

	public int getId(){
		return this.id;
	}

	public String getStatus(){
		return this.status;
	}

	public String getVoornaam(){
		return this.voornaam;
	}

	/**
	 * 
	 * @param achternaam    achternaam
	 */
	public void setAchternaam(String achternaam){
            this.achternaam = achternaam;
	}

	/**
	 * 
	 * @param beloning
	 */
	public void setBeloning(Beloning beloning){
		this.m_Beloning = beloning;
	}

	/**
	 * 
	 * @param contactgegevens    contactgegevens
	 */
	public void setContactgegevens(Contactgegevens contactgegevens){
		this.m_Contactgegevens = contactgegevens;
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
	 * @param voornaam    voornaam
	 */
	public void setVoornaam(String voornaam){
            this.voornaam = voornaam;
	}

}