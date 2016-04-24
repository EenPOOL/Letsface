package be.odisee.LetsFace.domain;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Julien
 * @version 1.0
 * @created 28-fevr.-2016 13:00:39
 */

@Component("medewerker2")
public class Marketeer implements IMedewerker {
    
        private String achternaam;
        private String voornaam;
        private int id;
        private String status;

        @Autowired
	public Marketeer(int id, String voornaam, String achternaam, String status){
            this.id = id;
            this.voornaam = voornaam;
            this.achternaam = achternaam;
            this.status = status;
	}

    public String getAchternaam() {
        return this.achternaam;
    }
    
    public String getVoornaam() {
        return this.voornaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}