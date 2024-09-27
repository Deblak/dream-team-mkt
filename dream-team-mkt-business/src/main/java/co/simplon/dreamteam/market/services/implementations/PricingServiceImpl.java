package co.simplon.dreamteam.market.services.implementations;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import co.simplon.dreamteam.market.dtos.PricingDto;
import co.simplon.dreamteam.market.entities.Offer;
import co.simplon.dreamteam.market.repositories.OfferRepository;
import co.simplon.dreamteam.market.services.PricingService;

@Service
public class PricingServiceImpl implements PricingService {
    private final OfferRepository repository;
    private static final Logger logger = LoggerFactory.getLogger(PricingServiceImpl.class);

    public PricingServiceImpl(OfferRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<PricingDto> getAll() {
	List<Offer> offers = repository.findAll();
	return PricingDto.fromOffersEntityListToPricingDtoList(offers);
    }

    @Override
    public void updatePricing(List<PricingDto> inputs) {
	for (PricingDto pricingDto : inputs) {
	    Optional<Offer> optionalOffer = repository.findById(pricingDto.id());
	    if (optionalOffer.isPresent()) {
		Offer offer = optionalOffer.get();
		if (pricingDto.detailPlanEn() != null && !pricingDto.detailPlanEn().isEmpty()) {
		    offer.setDetailPlanEn(pricingDto.detailPlanEn());
		}
		if (pricingDto.detailPlanFr() != null && !pricingDto.detailPlanFr().isEmpty()) {
		    offer.setDetailPlanFr(pricingDto.detailPlanFr());
		}
		repository.save(offer);
		logger.info(
			"The pricing with the id {} was correctly updated with detail plan offer fr : {} and detail plan offer  en :  {}",
			pricingDto.id(), offer.getDetailPlanFr(), offer.getDetailPlanEn());
	    } else {
		throw new RuntimeException("No offers found with id : " + pricingDto.id());
	    }
	}
    }

}
