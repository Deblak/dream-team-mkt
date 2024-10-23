package co.simplon.dreamteam.mkt.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.dtos.OfferDto;
import co.simplon.dreamteam.mkt.services.OfferService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/offers")
public class OfferController {
	private final OfferService service;

	public OfferController(OfferService service) {
		this.service = service;
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<OfferDto> getAllOfferDtos() {
		return service.getAll();
	}

	@PatchMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@RequestBody @Valid List<OfferDto> inputs) {
		service.updateData(inputs);
	}
}
