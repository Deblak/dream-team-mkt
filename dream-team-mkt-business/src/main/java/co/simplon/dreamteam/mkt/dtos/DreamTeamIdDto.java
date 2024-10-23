package co.simplon.dreamteam.mkt.dtos;

import jakarta.validation.constraints.NotBlank;

public record DreamTeamIdDto(@NotBlank String pictureFr, @NotBlank String pictureEn, @NotBlank String sloganFr, @NotBlank String sloganEn,
		@NotBlank String panelOneDescFr, @NotBlank String panelOneDescEn, @NotBlank String panelTwoDescFr, @NotBlank String panelTwoDescEn) {

}
