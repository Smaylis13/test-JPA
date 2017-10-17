package fr.deginamic.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Article;

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
		return "Article [ID_Article=" + id_Article + ", mReference=" + mReference + "]";
	}
}
