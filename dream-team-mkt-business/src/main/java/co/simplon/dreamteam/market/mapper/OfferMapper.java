package co.simplon.dreamteam.market.mapper;

import java.util.List;

import co.simplon.dreamteam.market.dtos.OfferDto;
import co.simplon.dreamteam.market.entities.Offer;

public class OfferMapper {

    public static List<OfferDto> entitiesToDtos(List<Offer> offers) {
	return offers.stream().map(o -> new OfferDto(o.getNameFr(), o.getNameEn(), o.getPriceFr(), o.getPriceEn(),
		o.getPlanFr(), o.getPlanEn(), o.getCallToActionFr(), o.getCallToActionEn())).toList();
    }

    public static List<Offer> dtosToEntities(List<OfferDto> inputs) {
	return inputs.stream().map(o -> {
	    Offer offer = new Offer();
	    offer.setCallToActionEn(o.callToActionEn());
	    offer.setCallToActionFr(o.callToActionFr());
	    offer.setNameEn(o.nameEn());
	    offer.setNameFr(o.nameFr());
	    offer.setPlanEn(o.planEn());
	    offer.setPlanFr(o.planFr());
	    offer.setPriceEn(o.priceEn());
	    offer.setPriceFr(o.priceFr());
	    return offer;
	}).toList();
    }

}
