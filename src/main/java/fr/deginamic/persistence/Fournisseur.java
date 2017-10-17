package fr.deginamic.persistence;

import java.util.List;

import javax.persistence.*;

@Entity
public class Fournisseur {
	
	@Id
	@Column(name="ID_FOURNISSEUR")
	private int id;
	
	@Column(name="NOM_FOURNISSEUR")
	private String name;
	
	@OneToMany(mappedBy="founisseur")
	private List<BonCommande> bonCommandes;
	
	@OneToMany(mappedBy="fournisseur")
	private List<Article> article;
	
	public Fournisseur() {
	}

}
