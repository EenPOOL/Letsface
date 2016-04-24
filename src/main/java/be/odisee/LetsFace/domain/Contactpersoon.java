package be.odisee.LetsFace.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:38
 */
@Entity
@Table(name="contactpersoon")
public class Contactpersoon {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String achternaam;
	@Column(nullable=false)
	private String voornaam;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String telefoonnummer;
	@Column(nullable=false)
	private String status;

	/*public void finalize() throws Throwable {

	}*/
	
	public Contactpersoon() {
		this.achternaam = "";
        this.voornaam = "";
        this.email = "";
        this.telefoonnummer = "";
        this.status = "";
	}
	
	public Contactpersoon(String achternaam, String voornaam, String email, String telefoonnummer){
            this.achternaam = achternaam;
            this.voornaam = voornaam;
            this.email = email;
            this.telefoonnummer = telefoonnummer;
            this.status = "";
	}
	
	public Contactpersoon(String achternaam, String voornaam, String email, String telefoonnummer, String status){
        this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.status = status;
	}

	
	public Contactpersoon(int id, String achternaam, String voornaam, String email, String telefoonnummer){
        this.id = id;
		this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.status = "";
	}
	
	public Contactpersoon(int id, String achternaam, String voornaam, String email, String telefoonnummer, String status){
        this.id = id;
		this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.status = status;
	}

	public int getId(){
		return this.id;
	}
	
	public String getAchternaam() {
		return this.achternaam;
	}
	
	public String getVoornaam(){
		return this.voornaam;
	}

	public String getEmail(){
		return this.email;
	}

	public String getTelefoonnummer(){
		return this.telefoonnummer;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setAchternaam(String achternaam){
            this.achternaam = achternaam;
	}
	
	public void setVoornaam(String voornaam){
        this.voornaam = voornaam;
	}
	
	public void setEmail(String email){
            this.email = email;
	}
	
	public void setTelefoonnummer(String telefoonnummer){
            this.telefoonnummer = telefoonnummer;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}