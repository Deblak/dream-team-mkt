package co.simplon.dreamteam.mkt.mapper;

import co.simplon.dreamteam.mkt.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.entities.DreamTeamId;

public class DreamTeamIdMapper {

	public static DreamTeamIdDto entityToDto(DreamTeamId dreamTeamId) {
		DreamTeamIdDto dreamTeamIdDto = new DreamTeamIdDto(dreamTeamId.getPictureFr(), dreamTeamId.getPictureEn(), dreamTeamId.getSloganFr(),
				dreamTeamId.getSloganEn(), dreamTeamId.getPanelOneDescFr(), dreamTeamId.getPanelOneDescEn(), dreamTeamId.getPanelTwoDescFr(),
				dreamTeamId.getPanelTwoDescEn());
		return dreamTeamIdDto;
	}

	public static DreamTeamId updateEntityWithDto(DreamTeamIdDto dreamTeamIdDto, DreamTeamId dreamTeamId) {
		dreamTeamId.setPanelOneDescEn(dreamTeamIdDto.panelOneDescEn());
		dreamTeamId.setPanelOneDescFr(dreamTeamIdDto.panelOneDescFr());
		dreamTeamId.setPanelTwoDescEn(dreamTeamIdDto.panelTwoDescEn());
		dreamTeamId.setPanelTwoDescFr(dreamTeamIdDto.panelTwoDescFr());
		dreamTeamId.setPictureFr(dreamTeamIdDto.pictureFr());
		dreamTeamId.setPictureEn(dreamTeamIdDto.pictureEn());
		dreamTeamId.setSloganEn(dreamTeamIdDto.sloganEn());
		dreamTeamId.setSloganFr(dreamTeamIdDto.sloganFr());
		return dreamTeamId;
	}

}
