package hci.rcentar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Smer {
	@Id
	String oznaka;
	@Column(nullable = false)
	String naziv;
	@Column(nullable = false)
	String datum;
	@Column(nullable = false)
	String opis;
	
	
	public Smer() {
		super();
	}


	public Smer(String oznaka, String naziv, String datum, String opis) {
		super();
		this.oznaka = oznaka;
		this.naziv = naziv;
		this.datum = datum;
		this.opis = opis;
	}


	public String getOznaka() {
		return oznaka;
	}


	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getDatum() {
		return datum;
	}


	public void setDatum(String datum) {
		this.datum = datum;
	}


	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	
	
	
}
