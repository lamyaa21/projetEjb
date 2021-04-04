package org.GestionEmployee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
	public class Service implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	@Column(name="CODE", length=30)
	private String code;
	
	private String libelle;
	public Service() {
	super();
	}
	public Service(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public Service(int id, String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}
	
	}
