package co.simplon.dream_team_mkt_business.mapper;

import co.simplon.dream_team_mkt_business.dtos.DreamTeamIdDto;
import co.simplon.dream_team_mkt_business.entities.DreamTeamId;

public class DreamTeamIdMapper {
    public static DreamTeamIdDto entityToDto(DreamTeamId dreamTeamId) {
	DreamTeamIdDto dreamTeamIdDto = new DreamTeamIdDto(dreamTeamId.getPicture(), dreamTeamId.getSloganFr(),
		dreamTeamId.getSloganEn(), dreamTeamId.getPanelOneDescFr(), dreamTeamId.getPanelOneDescEn(),
		dreamTeamId.getPanelTwoDescFr(), dreamTeamId.getPanelTwoDescEn());
	return dreamTeamIdDto;
    }

}
