package co.simplon.dreamteam.mkt.business.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContactFormDto(@NotBlank @Size(max = 200) String corporateName, @NotBlank @Size(max = 200) String firstName,
		@NotBlank @Size(max = 200) String lastName, String email, String phoneNumber, @NotBlank @Size(max = 2000) String message) {

}
