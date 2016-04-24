/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.odisee.LetsFace.domain;
import java.util.ArrayList;

/**
 *
 * @author Julien
 */
public class Vraag {

    public Vraag(int id, String vraag) {
        this.id = id;
        this.vraag = vraag;
    }
    
    private int id;
    private String vraag;
    private Object antwoord;
    private ArrayList<Antwoord> m_Antwoord;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public void addAntwoord(Antwoord antwoord)
    {
        this.m_Antwoord.add(antwoord);
    }

    
}
