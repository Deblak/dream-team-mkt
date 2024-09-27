package co.simplon.dreamteam.market.entities;

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
    @Column(name = "id")
    private Long id;

    @Column(name = "terms")
    private String terms;

    @Override
    public String toString() {
	return "Terms [id=" + id + ", terms=" + terms + "]";
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getTerms() {
	return terms;
    }

    public void setTerms(String terms) {
	this.terms = terms;
    }

    public Terms() {
	// Default ORM
    }
}
