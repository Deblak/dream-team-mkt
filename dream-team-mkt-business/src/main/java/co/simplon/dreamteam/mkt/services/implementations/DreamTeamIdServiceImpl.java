package co.simplon.dreamteam.mkt.services.implementations;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.mapper.DreamTeamIdMapper;
import co.simplon.dreamteam.mkt.repositories.DreamTeamIdRepository;
import co.simplon.dreamteam.mkt.services.DreamTeamIdService;

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
		return DreamTeamIdMapper.entityToDto(repository.saveAndFlush(DreamTeamIdMapper.updateEntityWithDto(dreamTeamIdDto, repository.findAll().getLast())));
	}

}
