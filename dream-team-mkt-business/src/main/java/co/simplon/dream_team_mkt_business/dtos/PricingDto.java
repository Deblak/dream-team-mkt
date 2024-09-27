package co.simplon.dream_team_mkt_business.dtos;

import java.util.List;

import co.simplon.dream_team_mkt_business.entities.Offer;

public record PricingDto(Long id, String detailPlanFr, String detailPlanEn) {

    public static List<PricingDto> fromOffersEntityListToPricingDtoList(List<Offer> offersEntities) {
	return offersEntities.stream().map(PricingDto::fromOfferEntity).toList();
    }

    private static PricingDto fromOfferEntity(Offer offer) {
	return new PricingDto(offer.getId(), offer.getDetailPlanFr(), offer.getDetailPlanEn());
    }
}
