package co.simplon.dreamteam.mkt.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.dtos.OfferDto;
import co.simplon.dreamteam.mkt.mapper.OfferMapper;
import co.simplon.dreamteam.mkt.repositories.OfferRepository;
import co.simplon.dreamteam.mkt.services.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
	private final OfferRepository repository;

	public OfferServiceImpl(OfferRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<OfferDto> getAll() {
		return OfferMapper.entitiesToDtos(
				repository.findAll().stream().sorted((o1, o2) -> Long.valueOf(o1.getId()).intValue() - Long.valueOf(o2.getId()).intValue()).toList());
	}

	@Override
	public void updateData(List<OfferDto> inputs) {
		repository.saveAll(OfferMapper.dtosToEntities(inputs, repository.findAll()));
	}
}
