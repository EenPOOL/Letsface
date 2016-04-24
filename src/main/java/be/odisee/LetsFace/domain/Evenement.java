package be.odisee.LetsFace.domain;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:38
 */
public class Evenement {

	private Date einddatum;
	private int id;
	private Locatie m_Locatie;
	private String naam;
	private Date startdatum;
	private String status;
	private ArrayList<Prospect> m_Prospect;
        private ArrayList<Vraag> m_Vraag;

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param naam
	 * @param startdatum
	 * @param einddatum
	 * @param id
	 * @param status
	 * @param locatie
	 */
	public Evenement(String naam, Date startdatum, Date einddatum, int id, String status, Locatie locatie){
            this.naam = naam;
            this.startdatum = startdatum;
            this.einddatum = einddatum;
            this.id = id;
            this.status = status;
            this.m_Locatie = locatie;
	}

	public void activeer(){
            this.status = "actief";
	}

	public void deactiveer(){
            this.status = "inactief";
	}

	public Date getEinddatum(){
		return this.einddatum;
	}

	public int getId(){
		return this.id;
	}

	public Locatie getLocatie(){
		return m_Locatie;
	}

	public String getNaam(){
		return this.naam;
	}

	public Date getStartdatum(){
		return this.startdatum;
	}

	public String getStatus(){
		return this.status;
	}


	/**
	 * 
	 * @param einddatum
	 */
	public void setEinddatum(Date einddatum){
            this.einddatum = einddatum;
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
	 * @param m_Locatie
	 */
	public void setLocatie(Locatie m_Locatie){
		this.m_Locatie = m_Locatie;
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
	 * @param startdatum
	 */
	public void setStartdatum(Date startdatum){
            this.startdatum = startdatum;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){
            this.status = status;
	}
        
        public ArrayList<Vraag> getVragen() {
            return m_Vraag;
        }

        public void addVraag(Vraag m_Vraag) {
            this.m_Vraag.add(m_Vraag);
        }
}