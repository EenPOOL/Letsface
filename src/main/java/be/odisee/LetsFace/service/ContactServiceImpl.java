package be.odisee.LetsFace.service;

import be.odisee.LetsFace.domain.*;
import be.odisee.LetsFace.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service("contactService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class ContactServiceImpl implements ContactService {

    private ContactpersoonDao contactpersoonDao;

    public ContactServiceImpl(){}

    @Autowired
    public void setContactpersoonDao(ContactpersoonDao contactpersoonDao) {
        this.contactpersoonDao = contactpersoonDao;
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Contactpersoon voegContactpersoonToe(String achternaam, String voornaam, String email, String telefoon, String status) {
        return contactpersoonDao.saveContactperson(achternaam,voornaam,email,telefoon,status);
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Contactpersoon zoekContactpersoonMetId(int id){
        return contactpersoonDao.getContactpersonById(id);
    }

    public List<Contactpersoon> geefAlleContactpersonen() {
        return contactpersoonDao.getAllContactpersons();
    }

}