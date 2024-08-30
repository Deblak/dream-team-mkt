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
		repository.deleteAll();
		List<Offer> offers = inputs.stream().map(o -> {
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
		repository.saveAll(offers);
	}
}
