package co.simplon.dreamteam.market.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_fr")
    private String nameFr;
    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "price_fr")
    private String priceFr;
    @Column(name = "price_en")
    private String priceEn;
    @Column(name = "plan_fr")
    private String planFr;
    @Column(name = "plan_en")
    private String planEn;
    @Column(name = "call_to_action_fr")
    private String callToActionFr;
    @Column(name = "call_to_action_en")
    private String callToActionEn;
    @Column(name = "detail_plan_fr")
    private String detailPlanFr;
    @Column(name = "detail_plan_en")
    private String detailPlanEn;

    @Override
    public String toString() {
	return "Offer [id=" + id + ", nameFr=" + nameFr + ", nameEn=" + nameEn + ", priceFr=" + priceFr + ", priceEn="
		+ priceEn + ", planFr=" + planFr + ", planEn=" + planEn + ", callToActionFr=" + callToActionFr
		+ ", callToActionEn=" + callToActionEn + ", detailPlanFr=" + detailPlanFr + ", detailPlanEn="
		+ detailPlanEn + "]";
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getNameFr() {
	return nameFr;
    }

    public void setNameFr(String nameFr) {
	this.nameFr = nameFr;
    }

    public String getNameEn() {
	return nameEn;
    }

    public void setNameEn(String nameEn) {
	this.nameEn = nameEn;
    }

    public String getPriceFr() {
	return priceFr;
    }

    public void setPriceFr(String priceFr) {
	this.priceFr = priceFr;
    }

    public String getPriceEn() {
	return priceEn;
    }

    public void setPriceEn(String priceEn) {
	this.priceEn = priceEn;
    }

    public String getPlanFr() {
	return planFr;
    }

    public void setPlanFr(String planFr) {
	this.planFr = planFr;
    }

    public String getPlanEn() {
	return planEn;
    }

    public void setPlanEn(String planEn) {
	this.planEn = planEn;
    }

    public String getCallToActionFr() {
	return callToActionFr;
    }

    public void setCallToActionFr(String callToActionFr) {
	this.callToActionFr = callToActionFr;
    }

    public String getCallToActionEn() {
	return callToActionEn;
    }

    public void setCallToActionEn(String callToActionEn) {
	this.callToActionEn = callToActionEn;
    }

    public String getDetailPlanFr() {
	return detailPlanFr;
    }

    public void setDetailPlanFr(String detailPlanFr) {
	this.detailPlanFr = detailPlanFr;
    }

    public String getDetailPlanEn() {
	return detailPlanEn;
    }

    public void setDetailPlanEn(String detailPlanEn) {
	this.detailPlanEn = detailPlanEn;
    }

    public Offer() {
	// Default ORM
    }

}
