package Base_donnee;
// Generated 9 mars 2022, 15:00:04 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Etudiant generated by hbm2java
 */
@Entity
@Table(name = "etudiant", catalog = "systemdeparrainage")
public class Etudiant implements java.io.Serializable {

	private Integer idEtudiant;
	private String nom;
	private String prenom;
	private String genre;
	private Date dateNaiss;
	private Set<Parcourt> parcourts = new HashSet<Parcourt>(0);

	public Etudiant() {
	}

	public Etudiant(String nom, String prenom, String genre, Date dateNaiss) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateNaiss = dateNaiss;
	}

	public Etudiant(String nom, String prenom, String genre, Date dateNaiss, Set<Parcourt> parcourts) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateNaiss = dateNaiss;
		this.parcourts = parcourts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IdEtudiant", unique = true, nullable = false)
	public Integer getIdEtudiant() {
		return this.idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	@Column(name = "Nom", nullable = false, length = 25)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "Genre", nullable = false, length = 5)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateNaiss", nullable = false, length = 10)
	public Date getDateNaiss() {
		return this.dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiant")
	public Set<Parcourt> getParcourts() {
		return this.parcourts;
	}

	public void setParcourts(Set<Parcourt> parcourts) {
		this.parcourts = parcourts;
	}

}
