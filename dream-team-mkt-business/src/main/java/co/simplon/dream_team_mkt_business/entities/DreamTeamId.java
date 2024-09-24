package co.simplon.dream_team_mkt_business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_dream_team_identity")
public class DreamTeamId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identity")
    private Long idIdentity;

    @Column(name = "picture")
    private String picture;

    @Column(name = "slogan_fr")
    private String sloganFr;
    @Column(name = "slogan_en")
    private String sloganEn;

    @Column(name = "panel_1_desc_fr")
    private String panelOneDescFr;
    @Column(name = "panel_1_desc_en")
    private String panelOneDescEn;

    @Column(name = "panel_2_desc_fr")
    private String panelTwoDescFr;
    @Column(name = "panel_2_desc_en")
    private String panelTwoDescEn;

    public DreamTeamId() {
	// Default ORM
    }

    public Long getIdIdentity() {
	return idIdentity;
    }

    @SuppressWarnings("unused")
    private void setIdIdentity(Long idIdentity) {
	this.idIdentity = idIdentity;
    }

    public String getPicture() {
	return picture;
    }

    public void setPicture(String picture) {
	this.picture = picture;
    }

    public String getSloganFr() {
	return sloganFr;
    }

    public void setSloganFr(String sloganFr) {
	this.sloganFr = sloganFr;
    }

    public String getSloganEn() {
	return sloganEn;
    }

    public void setSloganEn(String sloganEn) {
	this.sloganEn = sloganEn;
    }

    public String getPanelOneDescFr() {
	return panelOneDescFr;
    }

    public void setPanelOneDescFr(String panelOneDescFr) {
	this.panelOneDescFr = panelOneDescFr;
    }

    public String getPanelOneDescEn() {
	return panelOneDescEn;
    }

    public void setPanelOneDescEn(String panelOneDescEn) {
	this.panelOneDescEn = panelOneDescEn;
    }

    public String getPanelTwoDescFr() {
	return panelTwoDescFr;
    }

    public void setPanelTwoDescFr(String panelTwoDescFr) {
	this.panelTwoDescFr = panelTwoDescFr;
    }

    public String getPanelTwoDescEn() {
	return panelTwoDescEn;
    }

    public void setPanelTwoDescEn(String panelTwoDescEn) {
	this.panelTwoDescEn = panelTwoDescEn;
    }

    @Override
    public String toString() {
	return "DreamTeamIdentity [idIdentity=" + idIdentity + ", picture=" + picture + ", sloganFr=" + sloganFr
		+ ", sloganEn=" + sloganEn + ", panelOneDescFr=" + panelOneDescFr + ", panelOneDescEn=" + panelOneDescEn
		+ ", panelTwoDescFr=" + panelTwoDescFr + ", panelTwoDescEn=" + panelTwoDescEn + "]";
    }

}
