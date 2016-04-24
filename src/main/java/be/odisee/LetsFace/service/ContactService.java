package be.odisee.LetsFace.service;

import be.odisee.LetsFace.domain.*;
import java.util.List;

public interface ContactService {

    public Contactpersoon voegContactpersoonToe(String achternaam, String voornaam, String email, String telefoon, String status);

    public Contactpersoon zoekContactpersoonMetId(int id);

    public List<Contactpersoon> geefAlleContactpersonen();

}