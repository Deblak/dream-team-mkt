package co.simplon.dreamteam.mkt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.services.DreamTeamIdService;

@RestController
@RequestMapping("/dreamteam")
@CrossOrigin("*")
public class DreamTeamIdController {
	private final DreamTeamIdService service;

	public DreamTeamIdController(DreamTeamIdService service) {
		this.service = service;
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public DreamTeamIdDto get() {
		return service.get();
	}

	@PostMapping("/updateData")
	@ResponseStatus(code = HttpStatus.OK)
	public DreamTeamIdDto postMethodName(@RequestBody DreamTeamIdDto inputs) {
		return service.updateData(inputs);
	}

}
