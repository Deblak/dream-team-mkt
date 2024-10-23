package co.simplon.dreamteam.mkt.dtos;

import java.util.List;

import co.simplon.dreamteam.mkt.entities.Offer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record PricingDto(@Positive Long id, @NotBlank String detailPlanFr, @NotBlank String detailPlanEn) {

	public static List<PricingDto> fromOffersEntityListToPricingDtoList(List<Offer> offersEntities) {
		return offersEntities.stream().map(PricingDto::fromOfferEntity).toList();
	}

	private static PricingDto fromOfferEntity(Offer offer) {
		return new PricingDto(offer.getId(), offer.getDetailPlanFr(), offer.getDetailPlanEn());
	}
}
