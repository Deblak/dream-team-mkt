package co.simplon.dream_team_mkt_business.entities;

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
    @Column(name = "id_offer")
    private Long idOffer;

    @Column(name = "name_offer_fr")
    private String nameOfferFr;
    @Column(name = "name_offer_en")
    private String nameOfferEn;

    @Column(name = "price_offer_fr")
    private String priceOfferFr;
    @Column(name = "price_offer_en")
    private String priceOfferEn;
    @Column(name = "plan_offer_fr")
    private String planOfferFr;
    @Column(name = "plan_offer_en")
    private String planOfferEn;
    @Column(name = "call_to_action_fr")
    private String callToActionFr;
    @Column(name = "call_to_action_en")
    private String callToActionEn;

    public Long getIdOffer() {
	return idOffer;
    }

    @SuppressWarnings("unused")
    private void setIdOffer(Long idOffer) {
	this.idOffer = idOffer;
    }

    public String getNameOfferFr() {
	return nameOfferFr;
    }

    public void setNameOfferFr(String nameOfferFr) {
	this.nameOfferFr = nameOfferFr;
    }

    public String getNameOfferEn() {
	return nameOfferEn;
    }

    public void setNameOfferEn(String nameOfferEn) {
	this.nameOfferEn = nameOfferEn;
    }

    public String getPriceOfferFr() {
	return priceOfferFr;
    }

    public void setPriceOfferFr(String priceOfferFr) {
	this.priceOfferFr = priceOfferFr;
    }

    public String getPriceOfferEn() {
	return priceOfferEn;
    }

    public void setPriceOfferEn(String priceOfferEn) {
	this.priceOfferEn = priceOfferEn;
    }

    public String getPlanOfferFr() {
	return planOfferFr;
    }

    public void setPlanOfferFr(String planOfferFr) {
	this.planOfferFr = planOfferFr;
    }

    public String getPlanOfferEn() {
	return planOfferEn;
    }

    public void setPlanOfferEn(String planOfferEn) {
	this.planOfferEn = planOfferEn;
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

    @Override
    public String toString() {
	return "Offer [idOffer=" + idOffer + ", nameOfferFr=" + nameOfferFr + ", nameOfferEn=" + nameOfferEn
		+ ", priceOfferFr=" + priceOfferFr + ", priceOfferEn=" + priceOfferEn + ", planOfferFr=" + planOfferFr
		+ ", planOfferEn=" + planOfferEn + ", callToActionFr=" + callToActionFr + ", callToActionEn="
		+ callToActionEn + "]";
    }

    public Offer() {
	// Default ORM
    }

}
