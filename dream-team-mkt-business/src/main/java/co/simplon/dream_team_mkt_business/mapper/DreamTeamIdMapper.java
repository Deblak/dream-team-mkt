package co.simplon.dream_team_mkt_business.mapper;

import co.simplon.dream_team_mkt_business.dtos.DreamTeamIdDto;
import co.simplon.dream_team_mkt_business.entities.DreamTeamId;

public class DreamTeamIdMapper {

	public static DreamTeamIdDto entityToDto(DreamTeamId dreamTeamId) {
		DreamTeamIdDto dreamTeamIdDto = new DreamTeamIdDto(dreamTeamId.getPictureFr(), dreamTeamId.getPictureEn(), dreamTeamId.getSloganFr(),
				dreamTeamId.getSloganEn(), dreamTeamId.getPanelOneDescFr(), dreamTeamId.getPanelOneDescEn(), dreamTeamId.getPanelTwoDescFr(),
				dreamTeamId.getPanelTwoDescEn());
		return dreamTeamIdDto;
	}

	public static DreamTeamId updateEntityWithInputs(DreamTeamIdDto dreamTeamIdDto, DreamTeamId dreamTeamId) {
		dreamTeamId.setPanelOneDescEn(dreamTeamIdDto.panelOneDescEn());
		dreamTeamId.setPanelOneDescFr(dreamTeamIdDto.panelOneDescFr());
		dreamTeamId.setPanelTwoDescEn(dreamTeamIdDto.panelTwoDescEn());
		dreamTeamId.setPanelTwoDescFr(dreamTeamIdDto.panelTwoDescFr());
		dreamTeamId.setPictureFr(dreamTeamIdDto.picture_fr());
		dreamTeamId.setPictureEn(dreamTeamIdDto.picture_en());
		dreamTeamId.setSloganEn(dreamTeamIdDto.sloganEn());
		dreamTeamId.setSloganFr(dreamTeamIdDto.sloganFr());
		return dreamTeamId;
	}

}
