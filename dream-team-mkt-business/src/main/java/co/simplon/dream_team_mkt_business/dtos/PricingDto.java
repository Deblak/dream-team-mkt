package co.simplon.dream_team_mkt_business.dtos;

import co.simplon.dream_team_mkt_business.entities.Offer;

import java.util.List;

public record PricingDto(Long id,
                         String detailPlanOfferFr, String detailPlanOfferEn) {

    public static List<PricingDto> fromOffersEntityListToPricingDtoList(List<Offer> offersEntities) {
        return offersEntities
                .stream()
                .map(PricingDto::fromOfferEntity)
                .toList();
    }

    private static PricingDto fromOfferEntity(Offer offer) {
        return new PricingDto(
                offer.getIdOffer(),offer.getDetailPlanOfferFr(),
                offer.getDetailPlanOfferEn()
        );
    }
}
