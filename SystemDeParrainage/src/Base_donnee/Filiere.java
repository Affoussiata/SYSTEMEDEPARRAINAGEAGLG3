package Base_donnee;
// Generated 9 mars 2022, 15:00:04 by Hibernate Tools 4.3.5.Final

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

/**
 * Filiere generated by hbm2java
 */
@Entity
@Table(name = "filiere", catalog = "systemdeparrainage")
public class Filiere implements java.io.Serializable {

	private Integer idFiliere;
	private String nom;
	private String mention;
	private Set<Niveau> niveaus = new HashSet<Niveau>(0);

	public Filiere() {
	}

	public Filiere(String nom, String mention) {
		this.nom = nom;
		this.mention = mention;
	}

	public Filiere(String nom, String mention, Set<Niveau> niveaus) {
		this.nom = nom;
		this.mention = mention;
		this.niveaus = niveaus;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IdFiliere", unique = true, nullable = false)
	public Integer getIdFiliere() {
		return this.idFiliere;
	}

	public void setIdFiliere(Integer idFiliere) {
		this.idFiliere = idFiliere;
	}

	@Column(name = "Nom", nullable = false, length = 20)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Mention", nullable = false, length = 20)
	public String getMention() {
		return this.mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filiere")
	public Set<Niveau> getNiveaus() {
		return this.niveaus;
	}

	public void setNiveaus(Set<Niveau> niveaus) {
		this.niveaus = niveaus;
	}

}
