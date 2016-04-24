package be.odisee.LetsFace.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import be.odisee.LetsFace.domain.Contactpersoon;

@Repository("contactpersoonDao")
@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
public class ContactpersoonHibernateDao extends HibernateDao implements ContactpersoonDao {

    public Contactpersoon saveContactperson(String achternaam, String voornaam, String email, String telefoon, String status) {
    	Contactpersoon contactpersoon = new Contactpersoon(achternaam, voornaam, email, telefoon, status);
        sessionSaveObject(contactpersoon);
        return contactpersoon;
    }    
    public Contactpersoon saveContactperson(int id, String achternaam, String voornaam, String email, String telefoon, String status) {
        Contactpersoon contactpersoon = new Contactpersoon(id, achternaam, voornaam, email, telefoon, status);
        sessionSaveObject(contactpersoon);
        return contactpersoon;
    }

    public Contactpersoon getContactpersonById(int contactpersoonId) {
        return (Contactpersoon) sessionGetObjectById("Contactpersoon", contactpersoonId);
    }

    @SuppressWarnings("unchecked")
	public List<Contactpersoon> getAllContactpersons() {
        return (List<Contactpersoon>) sessionGetAllObjects("Contactpersoon");
    }

    /*public void updateContactperson(Contactpersoon contactpersoon) {
        sessionUpdateObject(contactpersoon);
    }*/

}
