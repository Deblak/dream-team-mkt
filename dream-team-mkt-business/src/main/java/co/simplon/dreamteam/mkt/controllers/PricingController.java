package co.simplon.dreamteam.mkt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.dreamteam.mkt.dtos.PricingDto;
import co.simplon.dreamteam.mkt.services.PricingService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pricing")
public class PricingController {
   private final PricingService service;

    public PricingController(PricingService pricingService) {
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
