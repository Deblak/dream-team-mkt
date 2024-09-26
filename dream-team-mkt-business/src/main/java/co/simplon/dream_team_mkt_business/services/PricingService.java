package co.simplon.dream_team_mkt_business.services;

import co.simplon.dream_team_mkt_business.dtos.PricingDto;

import java.util.List;

public interface PricingService {
    List<PricingDto> getAll();
    void updatePricing(List<PricingDto> inputs);
}
