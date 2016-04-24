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
public interface IMedewerker {
    
		public String getAchternaam();
        public String getVoornaam();
        
        public void setAchternaam(String achternaam);
        public void setVoornaam(String voornaam);
        
        public int getId();
        public void setId(int Id);
        
        public String getStatus();
        public void setStatus(String status);
        

}
