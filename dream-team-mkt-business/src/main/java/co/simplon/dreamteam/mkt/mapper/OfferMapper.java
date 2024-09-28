package co.simplon.dreamteam.mkt.mapper;

import java.util.List;

import co.simplon.dreamteam.mkt.dtos.OfferDto;
import co.simplon.dreamteam.mkt.entities.Offer;

public class OfferMapper {

	public static List<OfferDto> entitiesToDtos(List<Offer> offers) {
		return offers.stream().map(o -> new OfferDto(o.getId(), o.getNameFr(), o.getNameEn(), o.getPriceFr(), o.getPriceEn(), o.getPlanFr(), o.getPlanEn(),
				o.getCallToActionFr(), o.getCallToActionEn())).toList();
	}

	public static List<Offer> dtosToEntities(List<OfferDto> dtos, List<Offer> offers) {
		return offers.stream().map(o -> {
			try {
				OfferDto dto = dtos.stream().filter(d -> d.id().equals(o.getId())).findFirst().get();
				o.setCallToActionEn(dto.callToActionEn());
				o.setCallToActionFr(dto.callToActionFr());
				o.setNameEn(dto.nameEn());
				o.setNameFr(dto.nameFr());
				o.setPlanEn(dto.planEn());
				o.setPlanFr(dto.planFr());
				o.setPriceEn(dto.priceEn());
				o.setPriceFr(dto.priceFr());
			} catch (Exception e) {
				System.out.println(e);
			}
			return o;
		}).toList();
	}

}
