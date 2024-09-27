package co.simplon.dreamteam.mkt.business.services.implementations;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.business.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.business.mapper.DreamTeamIdMapper;
import co.simplon.dreamteam.mkt.business.repositories.DreamTeamIdRepository;
import co.simplon.dreamteam.mkt.business.services.DreamTeamIdService;

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
