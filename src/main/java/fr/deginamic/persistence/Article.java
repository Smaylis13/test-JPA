package fr.deginamic.persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_article;

	@ManyToOne
	@JoinColumn(name = "fournisseur_id")
	private Fournisseur fournisseur;

	@ManyToMany
	@JoinTable(name = "compo", 
			joinColumns = @JoinColumn(name = "ID_ART", referencedColumnName = "ID_Article"), 
			inverseJoinColumns = @JoinColumn(name = "ID_BON", referencedColumnName = "ID")

	)
	private List<BonCommande> bonCommandes;

	@Column(name="DESIGNATION_Article")
	private String designiation;

	@Column(name="PRIX_Article")
	private double price;

	@Column(name = "REF_Article")
	private String mReference;

	public String getReference() {
		return mReference;
	}

	public void setReference(String mReference) {
		this.mReference = mReference;
	}

	public Article() {
	}

	@Override
	public String toString() {
		return "Article [ID_Article=" + id_article + ", mReference=" + mReference + "]";
	}

	public int getId() {
		return id_article;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public List<BonCommande> getBonCommandes() {
		return bonCommandes;
	}

	public String getDesigniation() {
		return designiation;
	}

	public double getPrice() {
		return price;
	}

	public String getmReference() {
		return mReference;
	}

	public void setId(int id) {
		this.id_article = id;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public void setBonCommandes(List<BonCommande> bonCommandes) {
		this.bonCommandes = bonCommandes;
	}

	public void setDesigniation(String designiation) {
		this.designiation = designiation;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setmReference(String mReference) {
		this.mReference = mReference;
	}
}
