package co.simplon.dream_team_mkt_business.mapper;

import java.util.ArrayList;
import java.util.List;

import co.simplon.dream_team_mkt_business.dtos.OfferDto;
import co.simplon.dream_team_mkt_business.entities.Offer;

public class OfferMapper {
    public static List<OfferDto> offersToOfferDtos(List<Offer> offers) {
	List<OfferDto> offerDtos = new ArrayList<OfferDto>();
	for (int i = 0; i < offers.size(); i++) {
	    Offer offer = offers.get(i);
	    OfferDto offerDto = new OfferDto(offer.getNameOfferFr(), offer.getNameOfferEn(), offer.getPriceOfferFr(),
		    offer.getPriceOfferEn(), offer.getPlanOfferFr(), offer.getPlanOfferEn(), offer.getCallToActionFr(),
		    offer.getCallToActionEn());
	    offerDtos.add(offerDto);
	}
	return offerDtos;
    }

}
