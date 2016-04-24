/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.odisee.LetsFace.domain;

/**
 *
 * @author Julien
 */
public class Antwoord {
    
    private int id;
    private Object value;
    private Prospect prospect;
    
    public Antwoord(int id, Object value, Prospect prospect) {
        this.id = id;
        this.value = value;
        this.prospect = prospect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Prospect getProspect() {
        return prospect;
    }

    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }
    
}
