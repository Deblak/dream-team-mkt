package co.simplon.dream_team_mkt_business.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.entities.DreamTeamId;
import co.simplon.dream_team_mkt_business.repositories.DreamTeamIdRepository;
import co.simplon.dream_team_mkt_business.services.DreamTeamIdService;

@Service
public class DreamTeamIdServiceImpl implements DreamTeamIdService {
	private final DreamTeamIdRepository repository;

	public DreamTeamIdServiceImpl(DreamTeamIdRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<DreamTeamId> getAll() {
		return repository.findAll();
	}

}
