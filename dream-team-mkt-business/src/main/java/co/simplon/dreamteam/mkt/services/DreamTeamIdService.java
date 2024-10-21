package co.simplon.dreamteam.mkt.services;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.mapper.DreamTeamIdMapper;
import co.simplon.dreamteam.mkt.repositories.DreamTeamIdRepository;

@Service
public class DreamTeamIdService {
	private final DreamTeamIdRepository repository;

	public DreamTeamIdService(DreamTeamIdRepository repository) {
		this.repository = repository;
	}

	public DreamTeamIdDto get() {
		return DreamTeamIdMapper.entityToDto(repository.findAll().getLast());
	}

	public DreamTeamIdDto updateData(DreamTeamIdDto dreamTeamIdDto) {
		return DreamTeamIdMapper.entityToDto(repository.saveAndFlush(DreamTeamIdMapper.updateEntityWithDto(dreamTeamIdDto, repository.findAll().getLast())));
	}

}
