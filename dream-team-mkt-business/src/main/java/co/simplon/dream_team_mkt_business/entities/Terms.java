package co.simplon.dream_team_mkt_business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_terms")
public class Terms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_terms")
    private Long idTerms;
    
    @Column(name = "terms")
	private String terms;

	public Long getIdTerms() {
		return idTerms;
	}

	public void setIdTerms(Long idTerms) {
		this.idTerms = idTerms;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	@Override
	public String toString() {
		return "Terms [idTerms=" + idTerms + ", terms=" + terms + "]";
	}

	public Terms() {
		// Default ORM
	}
}
