package org.GestionEmployee.model;

import java.sql.Date;

public class Employe {
	private String nom;
	private String prenom;
	private Date dateEmb;
	private double salaire;
	public Employe() {
		
	}
	public Employe(String nom, String prenom, Date dateEmb, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmb = dateEmb;
		this.salaire = salaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateEmb() {
		return dateEmb;
	}
	public void setDateEmb(Date dateEmb) {
		this.dateEmb = dateEmb;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	
	
	

}
