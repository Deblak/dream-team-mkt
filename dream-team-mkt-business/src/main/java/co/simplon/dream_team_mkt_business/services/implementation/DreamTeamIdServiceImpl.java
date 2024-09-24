package co.simplon.dream_team_mkt_business.services.implementation;

import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.dtos.DreamTeamIdDto;
import co.simplon.dream_team_mkt_business.mapper.DreamTeamIdMapper;
import co.simplon.dream_team_mkt_business.repositories.DreamTeamIdRepository;
import co.simplon.dream_team_mkt_business.services.DreamTeamIdService;

@Service
public class DreamTeamIdServiceImpl implements DreamTeamIdService {
	private final DreamTeamIdRepository repository;

	public DreamTeamIdServiceImpl(DreamTeamIdRepository repository) {
		this.repository = repository;
	}

	@Override
	public DreamTeamIdDto get() {
		return DreamTeamIdMapper.entityToDto(repository.findAll().getLast());
	}

	@Override
	public DreamTeamIdDto updateData(DreamTeamIdDto dreamTeamIdDto) {
		return DreamTeamIdMapper.entityToDto(repository.saveAndFlush(DreamTeamIdMapper.updateEntityWithInputs(dreamTeamIdDto, repository.findAll().getLast())));
	}

}
