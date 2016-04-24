package be.odisee.LetsFace.dao;

import be.odisee.LetsFace.domain.*;
import java.util.List;

public interface ContactpersoonDao {

	public Contactpersoon saveContactperson(String achternaam, String voornaam, String email, String telefoon, String status);

	public Contactpersoon saveContactperson(int id, String achternaam, String voornaam, String email, String telefoon, String status);

    public Contactpersoon getContactpersonById(int contactpersoonId);

    public List<Contactpersoon> getAllContactpersons();

    //public void updateContactperson(Contactpersoon contactpersoon);

}
