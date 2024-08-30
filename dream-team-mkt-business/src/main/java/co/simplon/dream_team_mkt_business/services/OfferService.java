package co.simplon.dream_team_mkt_business.services;

import java.util.List;

import co.simplon.dream_team_mkt_business.dtos.OfferDto;

public interface OfferService {
	List<OfferDto> getAll();

	void updateData(List<OfferDto> inputs);

}
