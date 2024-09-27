package co.simplon.dreamteam.mkt.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_dream_team_identities")
public class DreamTeamId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "picture_fr")
    private String pictureFr;

    @Column(name = "picture_en")
    private String pictureEn;

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

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getPictureFr() {
	return pictureFr;
    }

    public void setPictureFr(String pictureFr) {
	this.pictureFr = pictureFr;
    }

    public String getPictureEn() {
	return pictureEn;
    }

    public void setPictureEn(String pictureEn) {
	this.pictureEn = pictureEn;
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
	return "DreamTeamId [id=" + id + ", pictureFr=" + pictureFr + ", pictureEn=" + pictureEn + ", sloganFr="
		+ sloganFr + ", sloganEn=" + sloganEn + ", panelOneDescFr=" + panelOneDescFr + ", panelOneDescEn="
		+ panelOneDescEn + ", panelTwoDescFr=" + panelTwoDescFr + ", panelTwoDescEn=" + panelTwoDescEn + "]";
    }

}
