package co.simplon.dreamteam.market.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.market.dtos.OfferDto;
import co.simplon.dreamteam.market.services.OfferService;

@RestController
@RequestMapping("/offers")
@CrossOrigin("*")
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

	@PostMapping("/update")
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@RequestBody List<OfferDto> inputs) {
		service.updateData(inputs);
	}
}