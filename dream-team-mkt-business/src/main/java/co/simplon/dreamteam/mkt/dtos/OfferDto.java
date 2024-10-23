package co.simplon.dreamteam.mkt.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record OfferDto(@Positive Long id, @NotBlank String nameFr, @NotBlank String nameEn, @NotBlank String priceFr, @NotBlank String priceEn,
		@NotBlank String planFr, @NotBlank String planEn, @NotBlank String callToActionFr, @NotBlank String callToActionEn) {

}
