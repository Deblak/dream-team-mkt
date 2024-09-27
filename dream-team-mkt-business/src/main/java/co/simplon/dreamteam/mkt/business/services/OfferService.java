package co.simplon.dreamteam.mkt.business.services;

import java.util.List;

import co.simplon.dreamteam.mkt.business.dtos.OfferDto;

public interface OfferService {
	List<OfferDto> getAll();

	void updateData(List<OfferDto> inputs);

}
