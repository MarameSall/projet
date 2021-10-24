package com.niit.niitspringproject.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long idproduit;
	private String nomProduit;
	private  String Description;
	private  double prix;
	private  boolean selected;
	private byte[] photo;
	private int quantite;
	private Date dateCration;
	
	
	
	
	public Produit(String nomProduit, String description, double prix, boolean selected, byte[] photo, int quantite) {
		super();
		this.nomProduit = nomProduit;
		Description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Date getDateCration() {
		return dateCration;
	}
	public void setDateCration(Date dateCration) {
		this.dateCration = dateCration;
	}
	@Override
	public String toString() {
		return "Produit [idproduit=" + idproduit + ", nomProduit=" + nomProduit + ", Description=" + Description
				+ ", prix=" + prix + ", selected=" + selected + ", photo=" + Arrays.toString(photo) + ", quantite="
				+ quantite + ", dateCration=" + dateCration + "]";
	}
	
}
