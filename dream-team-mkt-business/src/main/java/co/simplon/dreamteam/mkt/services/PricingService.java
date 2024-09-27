package co.simplon.dreamteam.mkt.services;

import java.util.List;

import co.simplon.dreamteam.mkt.dtos.PricingDto;

public interface PricingService {
    List<PricingDto> getAll();
    void updatePricing(List<PricingDto> inputs);
}
