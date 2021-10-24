package com.niit.niitspringproject.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produit.class)
public abstract class Produit_ {

	public static volatile SingularAttribute<Produit, Date> dateCration;
	public static volatile SingularAttribute<Produit, String> Description;
	public static volatile SingularAttribute<Produit, Double> prix;
	public static volatile SingularAttribute<Produit, byte[]> photo;
	public static volatile SingularAttribute<Produit, Long> idproduit;
	public static volatile SingularAttribute<Produit, String> nomProduit;
	public static volatile SingularAttribute<Produit, Boolean> selected;
	public static volatile SingularAttribute<Produit, Integer> quantite;

	public static final String DATE_CRATION = "dateCration";
	public static final String DESCRIPTION = "Description";
	public static final String PRIX = "prix";
	public static final String PHOTO = "photo";
	public static final String IDPRODUIT = "idproduit";
	public static final String NOM_PRODUIT = "nomProduit";
	public static final String SELECTED = "selected";
	public static final String QUANTITE = "quantite";

}

