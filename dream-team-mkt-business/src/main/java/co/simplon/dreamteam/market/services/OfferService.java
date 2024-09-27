package co.simplon.dreamteam.market.services;

import java.util.List;

import co.simplon.dreamteam.market.dtos.OfferDto;

public interface OfferService {
	List<OfferDto> getAll();

	void updateData(List<OfferDto> inputs);

}
