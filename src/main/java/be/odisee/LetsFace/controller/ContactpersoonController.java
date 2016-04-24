package be.odisee.LetsFace.controller;

import be.odisee.LetsFace.domain.Contactpersoon;
import be.odisee.LetsFace.service.ContactService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ContactpersoonController {

    @Autowired
    protected ContactService contactService = null; // ready for dependency injection

    @RequestMapping(value={"/home.html","/index.html","lijst.html"},method=RequestMethod.GET)
    public String index(ModelMap model){
        List<Contactpersoon> deLijst = contactService.geefAlleContactpersonen();
        model.addAttribute("personen", deLijst);
        System.out.println("we proberen een lijst door te geven");
        return "/index";
    }
    // je zal naar index.jsp gaan

    @RequestMapping(value={"/contactpersoon.html"},method=RequestMethod.GET)
    public String persoonDetail(@RequestParam("id") Integer id, ModelMap model){
        Contactpersoon contactpersoon = contactService.zoekContactpersoonMetId(id);
        model.addAttribute("contactpersoon", contactpersoon);
        return "/contactpersoon";
    }
    // je zal naar contactpersoon.jsp gaan
    
    @RequestMapping(value={"/nieuweContactpersoon.html"},method=RequestMethod.GET)
    public String persoonFormulier(ModelMap model){
        Contactpersoon contactpersoon = new Contactpersoon();
        model.addAttribute("decontactpersoon", contactpersoon);
        return "/nieuweContactpersoon";
    }
    // je zal naar nieuweContactpersoon.jsp gaan

    @RequestMapping(value={"/nieuweContactpersoon.html"},method=RequestMethod.POST)
    public String contactpersoonToevoegen(@ModelAttribute("decontactpersoon") Contactpersoon contactpersoon, ModelMap model){
    Contactpersoon toegevoegdContactpersoon = contactService.voegContactpersoonToe(contactpersoon.getAchternaam(),
    																		contactpersoon.getVoornaam(),
    																		contactpersoon.getEmail(),
    																		contactpersoon.getTelefoonnummer(),
    																		contactpersoon.getStatus());
        System.out.println("DEBUG contactpersoonsgegevens familienaam: " + contactpersoon.getAchternaam());
        return "redirect:contactpersoon.html?id="+toegevoegdContactpersoon.getId();
    }
    // je zal naar de detailpagina van de net toegevoegde contactpersoon gaan

}
