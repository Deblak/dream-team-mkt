package co.simplon.dreamteam.mkt.business.services;

import java.util.List;

import co.simplon.dreamteam.mkt.business.dtos.PricingDto;

public interface PricingService {
    List<PricingDto> getAll();
    void updatePricing(List<PricingDto> inputs);
}
