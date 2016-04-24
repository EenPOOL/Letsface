package be.odisee.LetsFace.domain;

import java.util.ArrayList;

/**
 * @author Speybrouck Pieter
 * @version 1.0
 * @created 28-fevr.-2016 13:00:39
 */
public class Beloningspakket {

	private int id;
	public ArrayList<Beloning> m_Beloning = new ArrayList<Beloning>();
	private String status;

	/**
	 * 
	 * @param id
	 * @param status
	 * @param startBeloning
	 */
	public Beloningspakket(int id, String status, Beloning startBeloning){
            this.id = id;
            this.status = status;
            this.m_Beloning.add(startBeloning);
	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public ArrayList<Beloning> getBeloningen(){
		return this.m_Beloning;
	}

	public int getId(){
		return this.id;
	}

	public String getStatus(){
		return this.status;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
            this.id = id;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){
            this.status = status;
	}

	/**
	 * 
	 * @param beloning
	 */
	public void verwijderBeloning(Beloning beloning){
            this.m_Beloning.remove(beloning);
	}

	/**
	 * 
	 * @param beloning    beloning
	 */
	public void voegBeloningToe(Beloning beloning){
            this.m_Beloning.add(beloning);
	}

}