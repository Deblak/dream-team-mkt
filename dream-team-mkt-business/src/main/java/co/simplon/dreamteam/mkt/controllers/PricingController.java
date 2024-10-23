package co.simplon.dreamteam.mkt.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.dtos.PricingDto;
import co.simplon.dreamteam.mkt.services.PricingService;
import jakarta.validation.Valid;

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
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void updatePricingInfo(@RequestBody @Valid List<PricingDto> inputs) {
		service.updatePricing(inputs);
	}
}
