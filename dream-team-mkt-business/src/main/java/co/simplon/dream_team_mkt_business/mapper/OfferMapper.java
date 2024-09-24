package co.simplon.dream_team_mkt_business.mapper;

import java.util.List;

import co.simplon.dream_team_mkt_business.dtos.OfferDto;
import co.simplon.dream_team_mkt_business.entities.Offer;

public class OfferMapper {

	public static List<OfferDto> offersToOfferDtos(List<Offer> offers) {
		return offers.stream().map(o -> new OfferDto(o.getNameOfferFr(), o.getNameOfferEn(), o.getPriceOfferFr(), o.getPriceOfferEn(), o.getPlanOfferFr(),
				o.getPlanOfferEn(), o.getCallToActionFr(), o.getCallToActionEn())).toList();
	}

	public static List<Offer> offerDtosToOffers(List<OfferDto> inputs) {
		return inputs.stream().map(o -> {
			Offer offer = new Offer();
			offer.setCallToActionEn(o.callToActionEn());
			offer.setCallToActionFr(o.callToActionFr());
			offer.setNameOfferEn(o.nameOfferEn());
			offer.setNameOfferFr(o.nameOfferFr());
			offer.setPlanOfferEn(o.planOfferEn());
			offer.setPlanOfferFr(o.planOfferFr());
			offer.setPriceOfferEn(o.priceOfferEn());
			offer.setPriceOfferFr(o.priceOfferFr());
			return offer;
		}).toList();
	}

}
