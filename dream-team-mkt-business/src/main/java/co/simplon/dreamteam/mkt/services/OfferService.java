package co.simplon.dreamteam.mkt.services;

import java.util.List;

import co.simplon.dreamteam.mkt.dtos.OfferDto;

public interface OfferService {
	List<OfferDto> getAll();

	void updateData(List<OfferDto> inputs);

}
