package co.simplon.dream_team_mkt_business.controllers;

import co.simplon.dream_team_mkt_business.dtos.PricingDto;
import co.simplon.dream_team_mkt_business.services.implementations.PricingServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pricing")
public class PricingController {
   private final PricingServiceImpl service;

    public PricingController(PricingServiceImpl pricingService) {
        this.service = pricingService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<PricingDto> getAllPricingInfoList() {
        return service.getAll();
    }

    @PatchMapping()
    @ResponseStatus(code=HttpStatus.NO_CONTENT)
    public void updatePricingInfo(@RequestBody List<PricingDto> inputs) {
        service.updatePricing(inputs);
    }
}
