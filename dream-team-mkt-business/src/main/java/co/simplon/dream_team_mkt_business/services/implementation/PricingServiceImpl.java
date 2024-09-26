package co.simplon.dream_team_mkt_business.services.implementation;

import co.simplon.dream_team_mkt_business.dtos.PricingDto;
import co.simplon.dream_team_mkt_business.entities.Offer;
import co.simplon.dream_team_mkt_business.repositories.OfferRepository;
import co.simplon.dream_team_mkt_business.services.PricingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PricingServiceImpl implements PricingService {
    private final OfferRepository offerRepository;
    private static final Logger logger = LoggerFactory.getLogger(PricingServiceImpl.class);

    public PricingServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public List<PricingDto> getAll() {
        List <Offer> offers = offerRepository.findAll();
        return PricingDto.fromOffersEntityListToPricingDtoList(offers);

    }

    @Override
    public void updatePricing(List<PricingDto> inputs) {
        for(PricingDto pricingDto : inputs) {
            Optional<Offer> optionalOffer = offerRepository.findById(pricingDto.id());
            if(optionalOffer.isPresent()) {
                Offer offer = optionalOffer.get();
                if(pricingDto.detailPlanOfferEn() != null && !pricingDto.detailPlanOfferEn().isEmpty()){
                    offer.setDetailPlanOfferEn(pricingDto.detailPlanOfferEn());
                }
                if(pricingDto.detailPlanOfferFr() != null && !pricingDto.detailPlanOfferFr().isEmpty()) {
                    offer.setDetailPlanOfferFr(pricingDto.detailPlanOfferFr());
                }
                offerRepository.save(offer);
                logger.info("The pricing with the id {} was correctly updated with detail plan offer fr : {} and detail plan offer  en :  {}", pricingDto.id(), offer.getDetailPlanOfferFr(), offer.getDetailPlanOfferEn());
            } else {
                throw new RuntimeException("No offers found with id : " + pricingDto.id());
            }
        }
    }

}
