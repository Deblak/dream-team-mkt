package co.simplon.dream_team_mkt_business.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dream_team_mkt_business.entities.Offer;
import co.simplon.dream_team_mkt_business.services.OfferService;

@RestController
@RequestMapping("/offers")
@CrossOrigin("*")
public class OfferController {
    private final OfferService service;

    public OfferController(OfferService service) {
	super();
	this.service = service;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Offer> getAllOfferDtos() {
	return service.getAll();
    };
}
