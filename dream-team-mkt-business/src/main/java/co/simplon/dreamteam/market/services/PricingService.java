package co.simplon.dreamteam.market.services;

import java.util.List;

import co.simplon.dreamteam.market.dtos.PricingDto;

public interface PricingService {
    List<PricingDto> getAll();
    void updatePricing(List<PricingDto> inputs);
}
