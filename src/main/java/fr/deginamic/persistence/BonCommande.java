package fr.deginamic.persistence;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="bon")
public class BonCommande {

	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name="ID_FOU")
	private Fournisseur founisseur;
	
	@Column
	private int numero;
	
	@Column
	private int delai;
	
	@Column
	@Temporal(value = TemporalType.DATE)
	private Date date_cmde;
	
	public BonCommande() {
	}
	
	@ManyToMany(mappedBy="bonCommandes")
	private List<Article> articles;
	

	
	public int getId() {
		return id;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public Fournisseur getFounisseur() {
		return founisseur;
	}

	public int getNumero() {
		return numero;
	}

	public int getDelai() {
		return delai;
	}

	public Date getDate_commande() {
		return date_cmde;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public void setFounisseur(Fournisseur founisseur) {
		this.founisseur = founisseur;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public void setDate_commande(Date date_commande) {
		this.date_cmde = date_commande;
	}



}
