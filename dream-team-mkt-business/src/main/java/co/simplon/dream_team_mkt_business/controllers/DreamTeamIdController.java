package co.simplon.dream_team_mkt_business.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dream_team_mkt_business.entities.DreamTeamId;
import co.simplon.dream_team_mkt_business.services.DreamTeamIdService;

@RestController
@RequestMapping("/dreamteam")
@CrossOrigin("*")
public class DreamTeamIdController {
    private final DreamTeamIdService service;

    public DreamTeamIdController(DreamTeamIdService service) {
	super();
	this.service = service;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<DreamTeamId> getAll() {
	return service.getAll();
    }

}
