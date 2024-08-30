package co.simplon.dream_team_mkt_business.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.dtos.OfferDto;
import co.simplon.dream_team_mkt_business.entities.Offer;
import co.simplon.dream_team_mkt_business.mapper.OfferMapper;
import co.simplon.dream_team_mkt_business.repositories.OfferRepository;
import co.simplon.dream_team_mkt_business.services.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
	private final OfferRepository repository;

	public OfferServiceImpl(OfferRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<OfferDto> getAll() {
		List<Offer> offers = repository.findAll().stream()
				.sorted((o1, o2) -> Long.valueOf(o1.getIdOffer()).intValue() - Long.valueOf(o2.getIdOffer()).intValue()).toList();
		return OfferMapper.offersToOfferDtos(offers);
	}

	@Override
	public void updateData(List<OfferDto> inputs) {
		List<Offer> offers = repository.findAll().stream().map(o -> {
			Offer offer = new Offer();
			OfferDto offerDto = inputs.stream().filter(i -> i.nameOfferEn().equals(o.getNameOfferEn())).toList().getFirst();
			offer.setIdOffer(o.getIdOffer());
			offer.setCallToActionEn(offerDto.callToActionEn());
			offer.setCallToActionFr(offerDto.callToActionFr());
			offer.setNameOfferEn(offerDto.nameOfferEn());
			offer.setNameOfferFr(offerDto.nameOfferFr());
			offer.setPlanOfferEn(offerDto.planOfferEn());
			offer.setPlanOfferFr(offerDto.planOfferFr());
			offer.setPriceOfferEn(offerDto.priceOfferEn());
			offer.setPriceOfferFr(offerDto.priceOfferFr());
			return offer;
		}).toList();
		List<Offer> updateOffers = repository.saveAll(offers);
	}
}
